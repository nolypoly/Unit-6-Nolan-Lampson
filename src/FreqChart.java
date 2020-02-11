import java.util.Scanner;
public class FreqChart {

  private int[] list;

  public FreqChart (int[] list){
    this.list = list;
  }

  public String makeChart(){
    int chart;
  }

  FreqChart chart = new FreqChart(data);

  System.out.println(chart.makeChart());

  //main method to make chart
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How many values in data set? Enter Integer");
    int size = scan.nextInt();

    int[] data = new int[size];

    System.out.println("Enter each data value, followed by ENTER");
    int val = 0;
    for (int i = 0; i < data.length; i++){
      val = scan.nextInt();
      data[i] = val;
    }
  }
}
