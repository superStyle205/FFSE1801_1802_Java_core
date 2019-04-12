package Num2Text;

import java.util.Scanner;

public class ASM02 {

    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhap so muon convert:");
            String input=scanner.nextLine().replaceAll("\\s","");
            int inputLength=input.length();
            int inputSegment=inputLength/9;
            int inputRest=inputLength%9;
            int len=0;
            String[] inputArr=new String[10];
            String[] tempArray;
            String[] arr = {"", "mốt ","hai ","ba ","bốn ","lăm ","sáu ","bảy ","tám ", "chín "};
            String[] arrV1 = {"lẻ ", "mười ","hai ","ba ","bốn ","năm ","sáu ","bảy ","tám ", "chín "};
            String[] arrV2 = {"không ", "một ","hai ","ba ","bốn ","năm ","sáu ","bảy ","tám ", "chín "};
            String bil="";

            for (int i=0; i<=inputSegment;i++){
                if (inputLength-(i+1)*9<0){
                    len=0;
                } else {
					len=inputLength-(i+1)*9;
				}

                inputArr[i]=input.substring(len,inputLength-i*9);
                tempArray=inputArr[i].split("");
                int strLen=tempArray.length;
                int strDiv=strLen/3;

                String[] reverseTempArray= new String[strLen];
                for (int j=strLen-1;j>=0; j--){
                    reverseTempArray[strLen-1-j]=tempArray[j];
                }
                String decimal;
                String unit = "";
                String dummy = "";
                String result = "";
                String segmentInt= "";
                String segmentStr= "";
                boolean stop=false;

                for (int k=0;k<strDiv+1;k++){
                    for (int j=0;j<3;j++){
                        if (j+k*3+1>strLen){
                            stop=true;
                            break;
                        } else {
                            segmentInt=reverseTempArray[j+k*3]+segmentInt;}
                    }
                    if (segmentInt!=""){
                        if (Float.parseFloat(segmentInt)%100==0){
                            if (Float.parseFloat(segmentInt)%1000==0){
                                segmentStr="";
                            } else{segmentStr=arrV2[(int)Float.parseFloat(segmentInt)/100]+"trăm ";}
                        }
                        else {
                            for (int j=0;j<segmentInt.length();j++){
                                if ((double)j%3==2){
                                    dummy=arrV2[Integer.parseInt(reverseTempArray[j+k*3])];
                                    unit="trăm ";
                                }
                                else if ((double)j%3==1){
                                    dummy=arrV1[Integer.parseInt(reverseTempArray[j+k*3])];
                                    if (dummy=="mười " || dummy=="lẻ "){
                                        unit="";
                                    } else{unit="mươi ";}
                                }
                                else{
                                    if (j+1+k*3<strLen && Integer.parseInt(reverseTempArray[j+1+k*3])>0 && Integer.parseInt(reverseTempArray[j+k*3])==5) {
                                        dummy = "lăm ";
                                    }
                                    else if (Integer.parseInt(reverseTempArray[j+k*3])==0){
                                        dummy=arr[Integer.parseInt(reverseTempArray[j+k*3])];

                                    }
                                    else {
                                        dummy=arrV2[Integer.parseInt(reverseTempArray[j+k*3])];

                                    }
                                    unit="";
                                }
                                segmentStr= dummy + unit + segmentStr;
                            }
                        }
                        if (k % 3==1 && segmentStr!=""){decimal="ngàn ";}
                        else if (k % 3==2 && segmentStr!=""){decimal="triệu ";}
                        else if (k % 3==0 && k >0 ){decimal="tỷ ";}
                        else{decimal="";}
                        result=segmentStr + decimal + result;
                        segmentStr="";
                        segmentInt="";
                        decimal="";
                    }
                    if (stop==true){
                        break;}
                }
                inputArr[i]=result;
            }
            for (int i=inputSegment; i>=0;i--){
                if (i==inputSegment){
                    bil="";
                } else {bil="tỷ ";}
                System.out.print(bil+inputArr[i]);
            }

        }
    }
}


