import java.io.*;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart {
   public static void main( String[ ] args ) throws Exception
   {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue("IPhone 5s", new Double( 50 ) );
      dataset.setValue("SamSung Grand", new Double( 10 ) );
      dataset.setValue("MotoG", new Double( 15 ) );
      dataset.setValue("Nokia Lumia", new Double( 20 ) );

      JFreeChart chart = ChartFactory.createPieChart(
         "Mobile Sales", // chart title
         dataset, // data
         true, // include legend
         true,
         false);
         
      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File pieChart = new File( "WebContent/PieChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}