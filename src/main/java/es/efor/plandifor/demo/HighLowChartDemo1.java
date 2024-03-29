// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package es.efor.plandifor.demo;

import java.awt.Dimension;
import java.util.Date;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.date.DateUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class HighLowChartDemo1 extends ApplicationFrame
{

	public HighLowChartDemo1(String s)
	{
		super(s);
		OHLCDataset ohlcdataset = createDataset();
		JFreeChart jfreechart = createChart(ohlcdataset);
		ChartPanel chartpanel = new ChartPanel(jfreechart);
		chartpanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(chartpanel);
	}

	private static JFreeChart createChart(OHLCDataset ohlcdataset)
	{
		JFreeChart jfreechart = ChartFactory.createHighLowChart("High-Low-Open-Close Demo", "Time", "Value", ohlcdataset, true);
		XYPlot xyplot = (XYPlot)jfreechart.getPlot();
		DateAxis dateaxis = (DateAxis)xyplot.getDomainAxis();
		dateaxis.setTickMarkPosition(DateTickMarkPosition.MIDDLE);
		return jfreechart;
	}

	public static OHLCDataset createDataset()
	{
		Date adate[] = new Date[47];
		double ad[] = new double[47];
		double ad1[] = new double[47];
		double ad2[] = new double[47];
		double ad3[] = new double[47];
		double ad4[] = new double[47];
		int i = 1;
		byte byte0 = 2;
		adate[0] = DateUtilities.createDate(2001, i, 4, 12, 0);
		ad[0] = 47D;
		ad1[0] = 33D;
		ad2[0] = 35D;
		ad3[0] = 33D;
		ad4[0] = 100D;
		adate[1] = DateUtilities.createDate(2001, i, 5, 12, 0);
		ad[1] = 47D;
		ad1[1] = 32D;
		ad2[1] = 41D;
		ad3[1] = 37D;
		ad4[1] = 150D;
		adate[2] = DateUtilities.createDate(2001, i, 6, 12, 0);
		ad[2] = 49D;
		ad1[2] = 43D;
		ad2[2] = 46D;
		ad3[2] = 48D;
		ad4[2] = 70D;
		adate[3] = DateUtilities.createDate(2001, i, 7, 12, 0);
		ad[3] = 51D;
		ad1[3] = 39D;
		ad2[3] = 40D;
		ad3[3] = 47D;
		ad4[3] = 200D;
		adate[4] = DateUtilities.createDate(2001, i, 8, 12, 0);
		ad[4] = 60D;
		ad1[4] = 40D;
		ad2[4] = 46D;
		ad3[4] = 53D;
		ad4[4] = 120D;
		adate[5] = DateUtilities.createDate(2001, i, 9, 12, 0);
		ad[5] = 62D;
		ad1[5] = 55D;
		ad2[5] = 57D;
		ad3[5] = 61D;
		ad4[5] = 110D;
		adate[6] = DateUtilities.createDate(2001, i, 10, 12, 0);
		ad[6] = 65D;
		ad1[6] = 56D;
		ad2[6] = 62D;
		ad3[6] = 59D;
		ad4[6] = 70D;
		adate[7] = DateUtilities.createDate(2001, i, 11, 12, 0);
		ad[7] = 55D;
		ad1[7] = 43D;
		ad2[7] = 45D;
		ad3[7] = 47D;
		ad4[7] = 20D;
		adate[8] = DateUtilities.createDate(2001, i, 12, 12, 0);
		ad[8] = 54D;
		ad1[8] = 33D;
		ad2[8] = 40D;
		ad3[8] = 51D;
		ad4[8] = 30D;
		adate[9] = DateUtilities.createDate(2001, i, 13, 12, 0);
		ad[9] = 47D;
		ad1[9] = 33D;
		ad2[9] = 35D;
		ad3[9] = 33D;
		ad4[9] = 100D;
		adate[10] = DateUtilities.createDate(2001, i, 14, 12, 0);
		ad[10] = 54D;
		ad1[10] = 38D;
		ad2[10] = 43D;
		ad3[10] = 52D;
		ad4[10] = 50D;
		adate[11] = DateUtilities.createDate(2001, i, 15, 12, 0);
		ad[11] = 48D;
		ad1[11] = 41D;
		ad2[11] = 44D;
		ad3[11] = 41D;
		ad4[11] = 80D;
		adate[12] = DateUtilities.createDate(2001, i, 17, 12, 0);
		ad[12] = 60D;
		ad1[12] = 30D;
		ad2[12] = 34D;
		ad3[12] = 44D;
		ad4[12] = 90D;
		adate[13] = DateUtilities.createDate(2001, i, 18, 12, 0);
		ad[13] = 58D;
		ad1[13] = 44D;
		ad2[13] = 54D;
		ad3[13] = 56D;
		ad4[13] = 20D;
		adate[14] = DateUtilities.createDate(2001, i, 19, 12, 0);
		ad[14] = 54D;
		ad1[14] = 32D;
		ad2[14] = 42D;
		ad3[14] = 53D;
		ad4[14] = 70D;
		adate[15] = DateUtilities.createDate(2001, i, 20, 12, 0);
		ad[15] = 53D;
		ad1[15] = 39D;
		ad2[15] = 50D;
		ad3[15] = 49D;
		ad4[15] = 60D;
		adate[16] = DateUtilities.createDate(2001, i, 21, 12, 0);
		ad[16] = 47D;
		ad1[16] = 33D;
		ad2[16] = 41D;
		ad3[16] = 40D;
		ad4[16] = 30D;
		adate[17] = DateUtilities.createDate(2001, i, 22, 12, 0);
		ad[17] = 55D;
		ad1[17] = 37D;
		ad2[17] = 43D;
		ad3[17] = 45D;
		ad4[17] = 90D;
		adate[18] = DateUtilities.createDate(2001, i, 23, 12, 0);
		ad[18] = 54D;
		ad1[18] = 42D;
		ad2[18] = 50D;
		ad3[18] = 42D;
		ad4[18] = 150D;
		adate[19] = DateUtilities.createDate(2001, i, 24, 12, 0);
		ad[19] = 48D;
		ad1[19] = 37D;
		ad2[19] = 37D;
		ad3[19] = 47D;
		ad4[19] = 120D;
		adate[20] = DateUtilities.createDate(2001, i, 25, 12, 0);
		ad[20] = 58D;
		ad1[20] = 33D;
		ad2[20] = 39D;
		ad3[20] = 41D;
		ad4[20] = 80D;
		adate[21] = DateUtilities.createDate(2001, i, 26, 12, 0);
		ad[21] = 47D;
		ad1[21] = 31D;
		ad2[21] = 36D;
		ad3[21] = 41D;
		ad4[21] = 40D;
		adate[22] = DateUtilities.createDate(2001, i, 27, 12, 0);
		ad[22] = 58D;
		ad1[22] = 44D;
		ad2[22] = 49D;
		ad3[22] = 44D;
		ad4[22] = 20D;
		adate[23] = DateUtilities.createDate(2001, i, 28, 12, 0);
		ad[23] = 46D;
		ad1[23] = 41D;
		ad2[23] = 43D;
		ad3[23] = 44D;
		ad4[23] = 60D;
		adate[24] = DateUtilities.createDate(2001, i, 29, 12, 0);
		ad[24] = 56D;
		ad1[24] = 39D;
		ad2[24] = 39D;
		ad3[24] = 51D;
		ad4[24] = 40D;
		adate[25] = DateUtilities.createDate(2001, i, 30, 12, 0);
		ad[25] = 56D;
		ad1[25] = 39D;
		ad2[25] = 47D;
		ad3[25] = 49D;
		ad4[25] = 70D;
		adate[26] = DateUtilities.createDate(2001, i, 31, 12, 0);
		ad[26] = 53D;
		ad1[26] = 39D;
		ad2[26] = 52D;
		ad3[26] = 47D;
		ad4[26] = 60D;
		adate[27] = DateUtilities.createDate(2001, byte0, 1, 12, 0);
		ad[27] = 51D;
		ad1[27] = 30D;
		ad2[27] = 45D;
		ad3[27] = 47D;
		ad4[27] = 90D;
		adate[28] = DateUtilities.createDate(2001, byte0, 2, 12, 0);
		ad[28] = 47D;
		ad1[28] = 30D;
		ad2[28] = 34D;
		ad3[28] = 46D;
		ad4[28] = 100D;
		adate[29] = DateUtilities.createDate(2001, byte0, 3, 12, 0);
		ad[29] = 57D;
		ad1[29] = 37D;
		ad2[29] = 44D;
		ad3[29] = 56D;
		ad4[29] = 20D;
		adate[30] = DateUtilities.createDate(2001, byte0, 4, 12, 0);
		ad[30] = 49D;
		ad1[30] = 40D;
		ad2[30] = 47D;
		ad3[30] = 44D;
		ad4[30] = 50D;
		adate[31] = DateUtilities.createDate(2001, byte0, 5, 12, 0);
		ad[31] = 46D;
		ad1[31] = 38D;
		ad2[31] = 43D;
		ad3[31] = 40D;
		ad4[31] = 70D;
		adate[32] = DateUtilities.createDate(2001, byte0, 6, 12, 0);
		ad[32] = 55D;
		ad1[32] = 38D;
		ad2[32] = 39D;
		ad3[32] = 53D;
		ad4[32] = 120D;
		adate[33] = DateUtilities.createDate(2001, byte0, 7, 12, 0);
		ad[33] = 50D;
		ad1[33] = 33D;
		ad2[33] = 37D;
		ad3[33] = 37D;
		ad4[33] = 140D;
		adate[34] = DateUtilities.createDate(2001, byte0, 8, 12, 0);
		ad[34] = 59D;
		ad1[34] = 34D;
		ad2[34] = 57D;
		ad3[34] = 43D;
		ad4[34] = 70D;
		adate[35] = DateUtilities.createDate(2001, byte0, 9, 12, 0);
		ad[35] = 48D;
		ad1[35] = 39D;
		ad2[35] = 46D;
		ad3[35] = 47D;
		ad4[35] = 70D;
		adate[36] = DateUtilities.createDate(2001, byte0, 10, 12, 0);
		ad[36] = 55D;
		ad1[36] = 30D;
		ad2[36] = 37D;
		ad3[36] = 30D;
		ad4[36] = 30D;
		adate[37] = DateUtilities.createDate(2001, byte0, 11, 12, 0);
		ad[37] = 60D;
		ad1[37] = 32D;
		ad2[37] = 56D;
		ad3[37] = 36D;
		ad4[37] = 70D;
		adate[38] = DateUtilities.createDate(2001, byte0, 12, 12, 0);
		ad[38] = 56D;
		ad1[38] = 42D;
		ad2[38] = 53D;
		ad3[38] = 54D;
		ad4[38] = 40D;
		adate[39] = DateUtilities.createDate(2001, byte0, 13, 12, 0);
		ad[39] = 49D;
		ad1[39] = 42D;
		ad2[39] = 45D;
		ad3[39] = 42D;
		ad4[39] = 90D;
		adate[40] = DateUtilities.createDate(2001, byte0, 14, 12, 0);
		ad[40] = 55D;
		ad1[40] = 42D;
		ad2[40] = 47D;
		ad3[40] = 54D;
		ad4[40] = 70D;
		adate[41] = DateUtilities.createDate(2001, byte0, 15, 12, 0);
		ad[41] = 49D;
		ad1[41] = 35D;
		ad2[41] = 38D;
		ad3[41] = 35D;
		ad4[41] = 20D;
		adate[42] = DateUtilities.createDate(2001, byte0, 16, 12, 0);
		ad[42] = 47D;
		ad1[42] = 38D;
		ad2[42] = 43D;
		ad3[42] = 42D;
		ad4[42] = 10D;
		adate[43] = DateUtilities.createDate(2001, byte0, 17, 12, 0);
		ad[43] = 53D;
		ad1[43] = 42D;
		ad2[43] = 47D;
		ad3[43] = 48D;
		ad4[43] = 20D;
		adate[44] = DateUtilities.createDate(2001, byte0, 18, 12, 0);
		ad[44] = 47D;
		ad1[44] = 44D;
		ad2[44] = 46D;
		ad3[44] = 44D;
		ad4[44] = 30D;
		adate[45] = DateUtilities.createDate(2001, byte0, 19, 12, 0);
		ad[45] = 46D;
		ad1[45] = 40D;
		ad2[45] = 43D;
		ad3[45] = 44D;
		ad4[45] = 50D;
		adate[46] = DateUtilities.createDate(2001, byte0, 20, 12, 0);
		ad[46] = 48D;
		ad1[46] = 41D;
		ad2[46] = 46D;
		ad3[46] = 41D;
		ad4[46] = 100D;
		return new DefaultHighLowDataset("Series 1", adate, ad, ad1, ad2, ad3, ad4);
	}

	public static JPanel createDemoPanel()
	{
		JFreeChart jfreechart = createChart(createDataset());
		return new ChartPanel(jfreechart);
	}

	public static void main(String args[])
	{
		HighLowChartDemo1 highlowchartdemo1 = new HighLowChartDemo1("High-Low-Open-Close Demo");
		highlowchartdemo1.pack();
		RefineryUtilities.centerFrameOnScreen(highlowchartdemo1);
		highlowchartdemo1.setVisible(true);
	}
}
