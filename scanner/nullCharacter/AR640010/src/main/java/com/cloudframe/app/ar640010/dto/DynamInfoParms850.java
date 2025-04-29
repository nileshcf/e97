package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamInfoParms850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DynamInfoParms850 extends DynamInfoParms850Serialized { 
   

						@Getter @Setter private char[] dynamInfoDd850 = new char[8];

						@Getter @Setter private char[] dynamInfoDsn850 = new char[44];

						@Getter @Setter private char[] dynamInfoMember850 = new char[8];

						@Getter @Setter private char[] dynamInfoStatus850 = new char[1];

						@Getter @Setter private char[] dynamInfoDisp850 = new char[1];

						@Getter @Setter private char[] dynamInfoCond850 = new char[1];

						@Getter @Setter private char[] dynamInfoDsorg850 = new char[2];

								@Getter @Setter private short dynamInfoLimit850;

						@Getter @Setter private char[] dynamInfoAttr850 = new char[1];

						@Getter @Setter private char[] dynamInfoEntry850 = new char[1];

						@Getter @Setter private char[] dynamInfoType850 = new char[1];
	
	/**
	* Constructor for DynamInfoParms850
	**/
    public DynamInfoParms850() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DynamInfoParms850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamInfoParms850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDynamInfoDd850(fillSpace(8));
								setDynamInfoDsn850(fillSpace(44));
								setDynamInfoMember850(fillSpace(8));
								setDynamInfoStatus850(fillLowValue(1));
								setDynamInfoDisp850(fillLowValue(1));
								setDynamInfoCond850(fillLowValue(1));
								setDynamInfoDsorg850(getString(new byte[] {(byte)0x00,(byte)0x00}).toCharArray());
								setDynamInfoLimit850((short)0);
								setDynamInfoAttr850(fillLowValue(1));
								setDynamInfoEntry850(fillLowValue(1));
								setDynamInfoType850(fillLowValue(1));
    } 



}
  
