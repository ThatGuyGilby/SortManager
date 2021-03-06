package com.jgilbride.sorting.view;

import com.jgilbride.sorting.controller.SortManager;
import com.jgilbride.sorting.model.Sorter;
import com.jgilbride.sorting.model.SorterType;
import com.jgilbride.sorting.model.SuperSorter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Locale;

import static com.jgilbride.sorting.controller.SortManager.logger;

public class SorterWindow implements ActionListener
{
    Frame frame;
    Button sortButton;
    Panel panel;
    JComboBox comboBox;
    public Label inputLabel, outputLabel;
    public TextField inputField, outputField;
    GridLayout gridLayout;

    SortManager sortManager;
    SorterType sorterType;

    public static SorterWindow getWindow()
    {
        return new SorterWindow(350, 130);
    }

    private SorterWindow(int width, int height)
    {
        frame = new Frame("✨ Magic Sorting Machine ✨");
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        panel = new Panel();

        inputLabel = new Label("Input   ");
        inputField = new TextField(width / 10);
        inputField.setText("");
        frame.add(inputLabel);
        frame.add(inputField);

        outputLabel = new Label("Output");
        outputField = new TextField(width / 10);
        outputField.setText("[,]");
        outputField.setEditable(false);
        frame.add(outputLabel);
        frame.add(outputField);

        gridLayout = new GridLayout(4,4);
        panel.setLayout(gridLayout);

        String[] options = new String[SorterType.values().length];
        Arrays.setAll(options, i -> SorterType.values()[i].getName());

        comboBox = new JComboBox(options);
        comboBox.setSelectedIndex(SorterType.BUBBLE.ordinal());
        setSorterType(SorterType.BUBBLE);
        comboBox.addActionListener(this);
        frame.add(comboBox);

        sortButton = createButton("Sort", this);
        frame.add(sortButton);

        frame.add(panel);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setBackground(Color.lightGray);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        sortManager = new SortManager();

        logger.info("SorterWindow created successfully");
    }

    private Button createButton(String label, ActionListener actionListener)
    {
        Button button = new Button(label);
        button.addActionListener(actionListener);
        panel.add(button);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == sortButton)
        {
            sort();
        }

        if (event.getSource() == comboBox)
        {
            setSorterType(SorterType.values()[comboBox.getSelectedIndex()]);
        }
    }

    public void setSorterType(SorterType sorterType)
    {
        this.sorterType = sorterType;

        if (comboBox.getSelectedIndex() != this.sorterType.ordinal())
        {
            comboBox.setSelectedIndex(this.sorterType.ordinal());
        }
    }

    public void sort()
    {
        SuperSorter sorter = sortManager.getSorter(sorterType);

        String array = inputField.getText();
        String[] items = array.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++)
        {
            try
            {
                results[i] = Integer.parseInt(items[i]);
            }
            catch (NumberFormatException nfe)
            {
                logger.error(nfe);
            };
        }

        outputField.setText(Arrays.toString(sorter.sort(results)));

        StringBuilder stringBuilder = new StringBuilder("Sorted array using ");
        stringBuilder.append(sorterType.getName().toLowerCase(Locale.ROOT));
        stringBuilder.append(" sort.\nInput: ");
        stringBuilder.append(inputField.getText());
        stringBuilder.append("\nOutput: ");
        stringBuilder.append(outputField.getText());
        logger.info(stringBuilder.toString());
    }

    public void setInputFieldText(String string)
    {
        inputField.setText(string);
    }

    public String getOutputFieldText()
    {
        return outputField.getText();
    }
}
