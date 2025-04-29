package com.cloudframe.app.vsamdb2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItFirstTime100 = new char[1];

						@Getter @Setter private char[] sys001FileStatus200 = new char[2];

						@Getter @Setter private char[] abendParaName300 = new char[30];

								@Getter @Setter private int abendCode300;

						@Getter @Setter private char[] abendPara900 = new char[42];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItFirstTime100(("Y").toCharArray());
								setSys001FileStatus200(fillSpace(2));
								setAbendParaName300(fillSpace(30));
								setAbendCode300(0);
								setAbendPara900(("PARA NAME :                               ").toCharArray());
    }





}
  
