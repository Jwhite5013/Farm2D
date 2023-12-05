public class Farm{
private Acre[][]Land;
  public Farm(int rows, int col){
Acre[][]temp = new Acre[rows][col];
Land = temp;
  }
public void plant(String plan, int row, int col){
Land[row][col] = plan;
}
public String toString(){
  
}






  
}