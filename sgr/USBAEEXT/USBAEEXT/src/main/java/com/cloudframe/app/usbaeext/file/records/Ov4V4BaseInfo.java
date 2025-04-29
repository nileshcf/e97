package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4V4BaseInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ov4V4BaseInfo extends Ov4V4BaseInfoSerialized { 
   

						@Getter @Setter private char[] ov4ClerkId = Field.fillLowValue(8);

						@Getter @Setter private char[] ov4AcctCd = Field.fillLowValue(2);

						@Getter @Setter private char[] ov4SrcReceiptCd = Field.fillLowValue(6);

						@Getter @Setter private char[] ov4SrcErrorCd = Field.fillLowValue(6);

						@Getter @Setter private char[] ov4TypeCd = Field.fillLowValue(2);

								@Getter @Setter private long ov4GlAccountNumber;

						@Getter @Setter private char[] ov4CurrentDate = new char[10];

	
	/**
	* Constructor for Ov4V4BaseInfo
	**/
    public Ov4V4BaseInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4V4BaseInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4V4BaseInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setOv4CurrentDate(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 52
             ,6
             );
    } 



}
  
