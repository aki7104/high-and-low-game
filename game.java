import java.io.*;
public class game{
  public  static void main(String args[]) throws IOException{
  //タイトル
  System.out.println("これはHigh and Low Gameです");

  //基準値を出力する
  System.out.println("基準値:100");

  //HまたはLを入力する
  System.out.println("High(H)/Low(L)を入力してください > ");

  //eと入力されたらゲームを終了する
  if (res == 'e'){
    System.out.println("eが入力されたためゲームを終了します");
    System.exit(0);
  }

  //入力された文字列を出力する
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str = br.readLine();
  char res = str.charAt(0);

  //乱数を計算する
  int c = (int)(Math.random()*60)+70;

  //乱数値を出力する
  System.out.println("コンピューターの出力数値は" + c + "でした");

  //勝ち負けを判断し、出力する
  if (c < 100 && (res == 'L' || res == 'l')){
    System.out.println("勝ち");
  }
  else if (c > 100 && (res == 'H' || res == 'h')){
    System.out.println("勝ち");
  }
  else if (c < 100 &&(res == 'H' || res == 'h')){
    System.out.println("負け");
  }
  else if (c > 100 && (res == 'L' || res == 'l')){
    System.out.println("負け");
  }
  else if (c == 100){
    System.out.println("引き分け");
  }
 