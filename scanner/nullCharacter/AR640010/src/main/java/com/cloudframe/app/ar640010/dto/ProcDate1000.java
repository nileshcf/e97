package com.cloudframe.app.ar640010.dto;

/**
*  The class ProcDate1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ProcDate1000 extends ProcDate1000Serialized { 
   

						@Getter @Setter private char[] procDateYear1000 = new char[4];

						@Getter @Setter private char[] procDateDlm11000 = new char[1];

						@Getter @Setter private char[] procDateMonth1000 = new char[2];

						@Getter @Setter private char[] procDateDlm21000 = new char[1];

						@Getter @Setter private char[] procDateDay1000 = new char[2];
	
	/**
	* Constructor for ProcDate1000
	**/
    public ProcDate1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ProcDate1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProcDate1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setProcDateYear1000(fillSpace(4));
								setProcDateDlm11000(fillSpace(1));
								setProcDateMonth1000(fillSpace(2));
								setProcDateDlm21000(fillSpace(1));
								setProcDateDay1000(fillSpace(2));
    } 



}
  
