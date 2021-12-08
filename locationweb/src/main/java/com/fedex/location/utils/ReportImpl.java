package com.fedex.location.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;
@Component
public class ReportImpl implements Reports {

	@Override
	public void piechart(String path, List<Object[]> data) {

		DefaultPieDataset dataset = new DefaultPieDataset();// in a tabular form

		for (Object[] objects : data) {
			dataset.setValue(objects[0].toString(), new Double(objects[1].toString()));// we will get in object form
		}

		JFreeChart chart = ChartFactory.createPieChart3D("Location type report", dataset);// creates pie chart
		
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/piechart.jpeg"), chart, 300, 300);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
