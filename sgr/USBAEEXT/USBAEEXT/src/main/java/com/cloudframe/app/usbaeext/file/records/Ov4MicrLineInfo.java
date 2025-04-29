package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4MicrLineInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Ov4MicrLineInfo extends Ov4MicrLineInfoSerialized { 
   
				@Getter @Setter private Ov4Aba ov4Aba = new Ov4Aba();

						@Getter @Setter private char[] ov4AcctAppl = Field.fillLowValue(1);

								@Getter @Setter private long ov4AcctNo;

						@Getter @Setter private char[] ov4AmntSign = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal ov4Amnt = BigDecimal.ZERO;

	
	/**
	* Constructor for Ov4MicrLineInfo
	**/
    public Ov4MicrLineInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4MicrLineInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MicrLineInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getOv4Aba().setParent(this,getStartOffset() + 0);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 47
             ,20
             );
    } 



}
  
