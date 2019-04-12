
import java.awt.*; 
import java.awt.event.*; 

class changeNumbers extends Frame implements ActionListener{ 
     
    TextField txtNumber; 
    Button buConvert; 
    TextField txtOut; 

    changeNumbers(){ 
         
        super("Chuyển chữ sang số"); 
         
        txtNumber = new TextField("",80); 
        buConvert = new Button("Chuyển đổi"); 
         
        txtOut = new TextField("",50); 
         
        setLayout(new FlowLayout()); 
         
        add(txtNumber);add(buConvert);add(txtOut); 
         
        buConvert.addActionListener(this); 
         
        addWindowListener(new WindowAdapter(){ 
             
            public void windowClosing(WindowEvent e){ 
                 
                System.exit(0); 
            } 
        }); 
         
        pack(); 
        show(); 
    } 
     
    public static void main(String args[]){ 
         
        new changeNumbers(); 
    } 
     
    String parseStringToNumber(String n, int pos){ 
         
        char a[]; 
        int b = 0; 
        int c = 0; 
        String tmp = ""; 
        String strNumber = ""; 
        String result = ""; 
        String n1 = ""; 
        String nStr[] = {"không","một","hai","ba","bốn","năm","sáu","bẩy","tám","chín"}; 
        String mStr[] = {"","mười","trăm"}; 
        String vStr[] = {"","nghìn","triệu","tỉ","nghìn","triệu"}; 
         
        for(int j=n.length(), x=0; j>=0; j-=3, x+=3){ 
             
            n1 = n.substring((j-3<0)? 0 : j-3, j); 
         
            a = n1.toCharArray(); 
            strNumber = ""; 
             
            for(int i=0; i<a.length; i++){ 
                 
                try{ 
                    b = Integer.parseInt(""+a[a.length-i-1]); 
                    c = Integer.parseInt(""+a[Math.max(0, a.length-i-2)]); 
                }catch(NumberFormatException e){ 
                    return "Error: Not a strNumber"; 
                } 
                 
                tmp = (b==1)?((i==1)?"mười":((i==0 && c>1)?"mốt ":nStr[1]+" "+mStr[i]))  
                    :((b==5)?((i==0&&c!=0&&i+1<a.length)?"năm ":nStr[5]+" "+mStr[i])  
                    :((b==0)?((i==0)?"":((i==1 && c!=0)?"linh":((i==2)?"không"+" "+mStr[i]:""))):nStr[b]+" "+mStr[i])) ; 
                 
                strNumber = !strNumber.equals("")? tmp +" "+ strNumber : tmp; 
            } 
            if(strNumber.equals("")) break; 
            result =  !result.equals("")? strNumber + vStr[x/3]+" "+result : strNumber; 
        } 
         
        return result; 
    } 
     
    public void actionPerformed(ActionEvent e){ 
         
        Object obj = e.getSource(); 
         
        if(obj == buConvert){ 
             
            txtOut.setText(parseStringToNumber(txtNumber.getText(),2) ); 
        } 
    } 
}