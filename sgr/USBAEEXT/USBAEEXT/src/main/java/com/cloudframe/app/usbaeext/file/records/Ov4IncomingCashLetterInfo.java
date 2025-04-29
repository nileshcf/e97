package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4IncomingCashLetterInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Ov4IncomingCashLetterInfo extends Ov4IncomingCashLetterInfoSerialized { 
   

								@Getter @Setter private long ov4IclDate;
				@Getter @Setter private Ov4IclDateRedefined ov4IclDateRedefined = new Ov4IclDateRedefined();

								@Getter @Setter private BigDecimal ov4IclAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ov4IclTapeTotal = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ov4IclPrevious = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ov4IclNext = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ov4IclListedAs = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ov4IclShouldBe = BigDecimal.ZERO;

								@Getter @Setter private long ov4IclFromAba;

								@Getter @Setter private long ov4IclToAba;

								@Getter @Setter private long ov4IclSerialNo;
	
	/**
	* Constructor for Ov4IncomingCashLetterInfo
	**/
    public Ov4IncomingCashLetterInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4IncomingCashLetterInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4IncomingCashLetterInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getOv4IclDateRedefined().setParent(this,getStartOffset() + 0);
    } 



}
  
