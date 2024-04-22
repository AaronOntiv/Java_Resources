package Chapter8;

public class ComplexNumber {
    private float real;
    private float imag;

    public ComplexNumber(){
        this.real=0;
        this.imag=0;
    }
    public ComplexNumber(float real, float imag){
        this.real=real;
        this.imag=imag;
    }

    public ComplexNumber(float real){
        this.real=real;
        this.imag=0;
    }

    public static ComplexNumber sumaComplex(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber resultSum=new ComplexNumber();
        resultSum.setImag(num1.getImag()+ num2.getImag());
        resultSum.setReal(num1.getReal()+num2.getReal());
        return  resultSum;
    }

    public static void showComplexNumber(ComplexNumber complexNumber){
        System.out.printf("%f + %fi\n",complexNumber.getReal(),complexNumber.getImag());
    }

    public static ComplexNumber multiComplexNumber(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber resulMulti= new ComplexNumber();
        resulMulti.setReal(num1.getReal()* num2.getReal()- num1.getImag()* num2.getImag());
        resulMulti.setImag(num1.getImag()*num2.getReal()+ num1.getReal()*num2.getImag());
        return resulMulti;
    }



    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }
}
