package GeneralReviewQuestionsSectionOne;

public class DebtArrays {
    public static void main(String[] args) {
        int debtArrays[][] ={{0,100,200},{350,0,250},{150,500,0}};
        String names [] = {"emre","hasan","ali"};
        int total = 0;
        for (int satir = 0;satir< debtArrays.length;satir++){
            for (int sutun = 0;sutun<debtArrays[satir].length;sutun++){
                if(satir!=sutun){
                    int willGet = debtArrays[satir][sutun] - debtArrays[sutun][satir];
                    if (willGet<0){
                        System.out.println(names[satir]+" nin "+names[sutun]+" den alacagi : "+(willGet*-1));
                    }

                }
            }
        }

    }
}
