package com.cloudframe.app.sf305120.dto;

/**
*  The class SiServiceStruct820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SiServiceStruct820 extends SiServiceStruct820Serialized { 
   

						@Getter @Setter private char[] siServiceId820 = new char[4];

						@Getter @Setter private char[] siSrvReqId820 = new char[6];

						@Getter @Setter private char[] siServiceStatus820 = new char[1];

						@Getter @Setter private char[] siReturnCode820 = new char[1];

						@Getter @Setter private char[] siServiceRc820 = new char[1];

								@Getter @Setter private short siDataLen820;
	
	/**
	* Constructor for SiServiceStruct820
	**/
    public SiServiceStruct820() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SiServiceStruct820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SiServiceStruct820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSiServiceId820(fillSpace(4));
								setSiSrvReqId820(fillSpace(6));
								setSiServiceStatus820(getString(new byte[] {(byte)0x08}).toCharArray());
								setSiReturnCode820(getString(new byte[] {(byte)0x08}).toCharArray());
								setSiServiceRc820(getString(new byte[] {(byte)0x08}).toCharArray());
								setSiDataLen820((short)0);
    } 



}
  
