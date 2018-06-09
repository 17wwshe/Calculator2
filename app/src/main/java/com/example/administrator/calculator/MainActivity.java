package com.example.administrator.calculator;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    //组件设置
    private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private Button add, sub, div, multiply, reset, cancel, percent, point, calculate;
    private Button square, cube, Nth, sin, cos, tan, lg, ln, e, factorial, extract, reciprocal;
    //已经存在的文本
    private String str = "0";
    private boolean clear_flag = false;
    String result;
    /**
     * 结果
     */
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //利用log视察横竖屏状态，并初始化组件
        //横竖屏组件个数不一样，不用同一个方法，避免空指针
        int Orientation;
        Orientation = getResources().getConfiguration().orientation;
        Log.d("----", "" + Orientation);
        int mCurrentOrientation = getResources().getConfiguration().orientation;
        if (mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            // If current screen is portrait
            Log.i("info", "portrait"); // 竖屏
            initView_por();
            initEvent_por();  //初始化组件

        } else if (mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            //If current screen is landscape
            Log.i("info", "landscape"); // 横屏
            initView_por();
            initView_land();
            initEvent_por();  //初始化组件
            initEvent_land();  //初始化组件
        }
    }

    @Override
    protected void onPause() {

        super.onPause();

    }

  //与onCreate中的log功能一样
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

//竖屏初始化组件
    private void initView_por() {
        /*
        数字按钮初始化
         */
        bt0 = (Button) findViewById(R.id.button19);
        bt1 = (Button) findViewById(R.id.button15);
        bt2 = (Button) findViewById(R.id.button16);
        bt3 = (Button) findViewById(R.id.button17);
        bt4 = (Button) findViewById(R.id.button11);
        bt5 = (Button) findViewById(R.id.button12);
        bt6 = (Button) findViewById(R.id.button13);
        bt7 = (Button) findViewById(R.id.button6);
        bt8 = (Button) findViewById(R.id.button7);
        bt9 = (Button) findViewById(R.id.button8);
        /*
           运算符按钮初始化
         */
        add = (Button) findViewById(R.id.button14);
        sub = (Button) findViewById(R.id.button10);
        div = (Button) findViewById(R.id.button4);
        multiply = (Button) findViewById(R.id.button5);
        reset = (Button) findViewById(R.id.button3);
        cancel = (Button) findViewById(R.id.button9);
        percent = (Button) findViewById(R.id.button18);
        point = (Button) findViewById(R.id.button20);
        calculate = (Button) findViewById(R.id.button21);

        text = (TextView) findViewById(R.id.textView2);
        //
    }
//竖屏监听器
    private void initEvent_por() {
        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        multiply.setOnClickListener(this);
        reset.setOnClickListener(this);
        cancel.setOnClickListener(this);
        percent.setOnClickListener(this);
        point.setOnClickListener(this);
        calculate.setOnClickListener(this);
//        text.setKeyListener(null);
    }



    //横屏实现按钮的初始化
    private void initView_land() {
//        /*
//        数字按钮初始化
//         */
//        bt0 = (Button) findViewById(R.id.button19);
//        bt1 = (Button) findViewById(R.id.button15);
//        bt2 = (Button) findViewById(R.id.button16);
//        bt3 = (Button) findViewById(R.id.button17);
//        bt4 = (Button) findViewById(R.id.button11);
//        bt5 = (Button) findViewById(R.id.button12);
//        bt6 = (Button) findViewById(R.id.button13);
//        bt7 = (Button) findViewById(R.id.button6);
//        bt8 = (Button) findViewById(R.id.button7);
//        bt9 = (Button) findViewById(R.id.button8);
//        /*
//           运算符按钮初始化
//         */
//        add = (Button) findViewById(R.id.button14);
//        sub = (Button) findViewById(R.id.button10);
//        div = (Button) findViewById(R.id.button4);
//        multiply = (Button) findViewById(R.id.button5);
//        reset = (Button) findViewById(R.id.button3);
//        cancel = (Button) findViewById(R.id.button9);
//        percent = (Button) findViewById(R.id.button18);
//        point = (Button) findViewById(R.id.button20);
//        calculate = (Button) findViewById(R.id.button21);
//        //
        square = (Button) findViewById(R.id.button);
        cube = (Button) findViewById(R.id.button2);
        Nth = (Button) findViewById(R.id.button22);
        sin = (Button) findViewById(R.id.button24);
        cos = (Button) findViewById(R.id.button23);
        tan = (Button) findViewById(R.id.button25);
        lg = (Button) findViewById(R.id.button31);
        ln = (Button) findViewById(R.id.button30);
        e = (Button) findViewById(R.id.button29);
        factorial = (Button) findViewById(R.id.button26);
        extract = (Button) findViewById(R.id.button27);
        reciprocal = (Button) findViewById(R.id.button28);

            /*
            文本框初始化
             */
        text = (TextView) findViewById(R.id.textView2);


    }

    //横屏监听器
    private void initEvent_land() {
//        bt0.setOnClickListener(this);
//        bt1.setOnClickListener(this);
//        bt2.setOnClickListener(this);
//        bt3.setOnClickListener(this);
//        bt4.setOnClickListener(this);
//        bt5.setOnClickListener(this);
//        bt6.setOnClickListener(this);
//        bt7.setOnClickListener(this);
//        bt8.setOnClickListener(this);
//        bt9.setOnClickListener(this);
//        add.setOnClickListener(this);
//        sub.setOnClickListener(this);
//        div.setOnClickListener(this);
//        multiply.setOnClickListener(this);
//        reset.setOnClickListener(this);
//        cancel.setOnClickListener(this);
//        percent.setOnClickListener(this);
//        point.setOnClickListener(this);
//        calculate.setOnClickListener(this);
        square.setOnClickListener(this);
        cube.setOnClickListener(this);
        Nth.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        ln.setOnClickListener(this);
        lg.setOnClickListener(this);
        e.setOnClickListener(this);
        factorial.setOnClickListener(this);
        extract.setOnClickListener(this);
        reciprocal.setOnClickListener(this);
//        text.setKeyListener(null);
    }

    /**
     * 点击事件
     *
     * @param v 点击的控件
     */
    @Override
    public void onClick(View v) {

        str = text.getText().toString();
        switch (v.getId()) {
            /*
             * 数字
             */
            case R.id.button19://0
            case R.id.button15://1
            case R.id.button16://2
            case R.id.button17://3
            case R.id.button11://4
            case R.id.button12://5
            case R.id.button13://6
            case R.id.button6://7
            case R.id.button7://8
            case R.id.button8://9
            case R.id.button20://.
                str += ((Button) v).getText();
                text.setText(str);
//                Toast.makeText(this,"click",Toast.LENGTH_LONG).show();  //如果被点击则提示“click”
                break;

            //可以实现连续计算，str+=。。。
            case R.id.button14://+
            case R.id.button10://-
            case R.id.button5://*
            case R.id.button4:///
                str += " " + ((Button) v).getText() + " ";
                text.setText(str);
                break;
            //运算符输入时在两端加空格，以标志，在之后可以根据空格的位置，提取出运算符和数字
            //删除，判断字符串长度，0和1都置为0，大于1则长度减少一位
            case R.id.button9:  //DEL
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    text.setText("");
                }
                if (str != null && !str.equals("")) {
                    text.setText(str.substring(0, str.length() - 1));
                }
                break;
            //clean
            case R.id.button3:  //C
                clear_flag = false;
                str = "";
                text.setText(str);
                break;

            //%
            case R.id.button18:
                if (str.length() != 0){
                    result = Double.toString((Double.valueOf(str)) / 100.0);
                    clear_flag = false;
                    String string = result+"";
                    text.setText(string);
                }
                else {
                    str = "error";
                    return;
                }
                break;

            //=按钮
            case R.id.button21:
                getResult();
                break;

            //平方
            case R.id.button:
                if (str.length() != 0) {
                    double temp = Double.valueOf(str);
                    result = Double.toString(temp * temp);
                } else {
                    result = "error";
                    return;
                }
                text.setText(result);
                break;

            //立方
            case R.id.button2:
                if (str.length() != 0) {
                    double temp = Double.valueOf(str);
                    result = Double.toString(temp * temp * temp);
                } else {
                    result = "error";
                    return;
                }
                text.setText(result);
                break;

            //x的y次方
            case R.id.button22:
                if (str.length() != 0) {
                    str += " " + "^" + " ";
                    text.setText(str);
                } else {
                    result = "0";
                    return;
                }
                break;

            case R.id.button24:  //sin
            case R.id.button23:  //cos
            case R.id.button25:  //tan
            case R.id.button31:  //lg
            case R.id.button30:  //ln
            case R.id.button26:  //!
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    text.setText("");
                }
                str += " " + ((Button) v).getText() + " ";
                text.setText(str);
                break;

            case R.id.button27:  //开方
                if (str.length() != 0) {
                    double temp = Double.valueOf(str);
                    result = Double.toString(Math.sqrt(temp));
                } else
                    result = "0";
                //
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    text.setText("");
                }
                text.setText(result);
                break;

            case R.id.button28: //倒数
                if (str.length() != 0) {
                    double temp = 1 / Double.valueOf(str);
                    temp = (double) Math.round(temp * 100) / 100;  //保留两位小数
                    result = Double.toString(temp);
                } else
                    result = "error";
                //
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    text.setText("");
                }
                text.setText(result);
                break;
            case R.id.button29:  //e
                str = "";
                double e= Math.E;
                result = Double.toString(e);
                text.setText(result);
                break;
        }
    }


    private void getResult() {


        /*
         * 两个String类型的参数
         */
        String param1;
        String param2;
        String op;
        /*
         * 转换后的两个double类型的参数
         */
        double arg1;
        double arg2;
        double Result;

        /*
         * 如果有运算符，则进行运算
         * 没有运算符，则把已经存在的数据再传出去
         */
        if (str == null || str.equals("")) {
            return;
        }
        if (!str.contains(" "))
            return;
        clear_flag = true;

        //第一种情况，+、-、*、/
        if (str.contains("+") || str.contains("-") || str.contains("×") || str.contains("÷")) {
            param1 = str.substring(0, str.indexOf(" "));  //第一个空格  //获取第一个因数
            op = str.substring(str.indexOf(" ") + 1, str.indexOf(" ") + 2);  //获取运算符
            param2 = str.substring(str.indexOf(" ") + 3);             //获取第二个因数

            if (!param1.equals("") && !param2.equals("")) {          //如果两个因数不为空
                arg1 = Double.parseDouble(param1);
                arg2 = Double.parseDouble(param2);
                if (op.equals("+")) {
                    Result = arg1 + arg2;
                } else if (op.equals("-")) {
                    Result = arg1 - arg2;
                } else if (op.equals("×")) {
                    Result = arg1 * arg2;
                } else if (op.equals("÷")) {
                    if (arg2 == 0) {
                        Result = 0;
                    } else {
                        Result = arg1 / arg2;
                    }
                }
                else Result = 0;
                //非除法运算，整数的为整数输出
                if (!param1.contains(".") && !param2.contains(".") && !op.equals("÷")) {
                    int r = (int) Result;
                    String string = r + "";
                    text.setText(string);
                } else {
                    String string = Result + "";
                    text.setText(string);
                }

            }//第一种情况，+、-、*、/
            else if (!param1.equals("") && param2.equals("")) { //如果只有第二个因素 ，不运算
                text.setText(str);
            } else if (param1.equals("") && !param2.equals("")) {
                arg2 = Double.parseDouble(param2);

                switch (op) {
                    case "+":
                        Result = 0 + arg2;
                        break;
                    case "-":
                        Result = 0 - arg2;
                        break;
                    case "×":
                        Result = 0 * arg2;
                        break;
                    case "÷":
                        Result = 0;
                        break;
                    default:
                        Result = 0;
                }

                String string = Result + "";
                text.setText(string);
            } else if (param1.equals("") && param2.equals("")) {  //如果两个因数都为空，则继续编辑
                text.setText("");
            }
            //sin、cos、tan
        } else if (str.contains("sin") || str.contains("cos") || str.contains("tan")) {
            op = str.substring(str.indexOf(" ")+1, str.indexOf(" ") + 4);
            param2 = str.substring(str.indexOf(" ") + 5);
            arg2 = Double.parseDouble(param2);
            double result;
            String string;
            switch (op) {
                case "sin":
                    result = (int)(Math.sin(arg2)*100);
                    string = result/100.0 + "";
                    text.setText(string);
                    break;
                case "cos":
                    result = (int)(Math.cos(arg2)*100);
                    string = result/100.0 + "";
                    text.setText(string);
                    break;
                case "tan":
                    result = (int) (Math.tan(arg2)*100);
                    string = result/100.0 + "";
                    text.setText(string);
                    break;
                default:
                    text.setText("错误");
            }

        } else if (str.contains("!")) {
            param2 = str.substring(0,str.indexOf(" "));
            arg2 = Double.parseDouble(param2);
            String string;
            int tmpResult = 1;
            for (int i = 1; i <= (int) arg2; i++)
                tmpResult = tmpResult * i;
            Result = tmpResult;
            string =(int)Result + "";
            text.setText(string);

        } else if (str.contains("ln") || str.contains("lg")) {
            if (str.equals("ln")) {
                param2 = str.substring(str.indexOf(" ") + 4);
                arg2 = Double.parseDouble(param2);
                String string;
                Result = Math.log(arg2);
                string = Result + "";
                text.setText(string);

            } else {
                param2 = str.substring(str.indexOf(" ") + 4);
                arg2 = Double.parseDouble(param2);
                Result = Math.log10(arg2);
                String string = Result + "";
                text.setText(string);
            }

        }else if (str.contains("^")) {
            param1 = str.substring(0,str.indexOf(" "));
            arg1 = Double.parseDouble(param1);
            param2 = str.substring(str.indexOf(" ")+3);
            arg2 = Double.parseDouble(param2);
            Result = Math.pow(arg1,arg2);
            String string = Result+"";
            text.setText(string);
        }

    }
}
