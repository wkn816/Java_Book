class List3_10 {
	public static void main (String[] args) {

    int sum = 0;
    for( int i = 1; i <= 10; i++){
      sum += i ;
      System.out.println("変数sumに" + i + "を加え" + "sumは" + sum + "になりました");

      if (sum > 20){
        System.out.println("sumが20を超えたので処理を中断");
        break;
      }
    }

	}
}