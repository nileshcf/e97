package com.cloudframe.app.ar640010.dto;

/**
*  The class ProcDate810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ProcDate810 extends ProcDate810Serialized { 
   

								@Getter @Setter private int procYear810;

						@Getter @Setter private char[] procDlm1810 = new char[1];

								@Getter @Setter private int procMonth810;

						@Getter @Setter private char[] procDlm2810 = new char[1];

								@Getter @Setter private int procDay810;
	
	/**
	* Constructor for ProcDate810
	**/
    public ProcDate810() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ProcDate810. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProcDate810(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setProcYear810(0);
								setProcDlm1810(fillSpace(1));
								setProcMonth810(0);
								setProcDlm2810(fillSpace(1));
								setProcDay810(0);
    } 



}
  
