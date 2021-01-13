package org.yjj.chapter.s120;

public class FactoryMagic implements AutoCloseable {

	 private static FactoryMagic ins;
	 private FactoryMagic(){}

	 public static FactoryMagic getInstence(){
		if(ins==null){
			ins=new FactoryMagic();
		}
		return ins;
	 }
	 public IMagicSquare getMagicSquare(int n) throws MagicException{
		IMagicSquare im=null;
		if(n<=2){
			throw new MagicException("2보다 작은 수의 마장진은 ");
		}
		if(n%2!=0){
			im=new OddMagicSquare(n);
		}else if(n%4==0){
			im=new FourMagicSquare(n);
		}else{
			im=new SixMagicSquare(n);
		}		
		return im;
	 }
	
	 @Override
	 public void close() throws Exception {
		System.out.println("FactoryMagic End !!");
	 }
}
