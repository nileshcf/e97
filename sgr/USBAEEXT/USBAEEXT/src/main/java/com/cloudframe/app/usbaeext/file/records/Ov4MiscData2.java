package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4MiscData2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Ov4MiscData2 extends Ov4MiscData2Serialized { 
   


								private long ov4Md2CrAcct;


						private char[] ov4Md2CrTc = Field.fillLowValue(5);

								private BigDecimal ov4Md2CrAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for Ov4MiscData2
	**/
    public Ov4MiscData2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4MiscData2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MiscData2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 8
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 22
             ,2
             );
    } 

	/**
	 *	Returns the value of ov4Md2CrAcct
	 *	@return ov4Md2CrAcct
	 */
	public long getOv4Md2CrAcct() throws CFException {
       if (isOv4Md2CrAcctModified()) { 
           ov4Md2CrAcct = refreshOv4Md2CrAcct();
        }
   		return ov4Md2CrAcct;
	}
	

	
	   
	/**
	 * 	Update Ov4Md2CrAcct with the passed value
	 *  Corresponding COBOL Variable is OV4-MD2-CR-ACCT
	 *	@param number
	 */
	public void setOv4Md2CrAcct(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4Md2CrAcct = checkOv4Md2CrAcctMaxLimit(number); 
		serializeOv4Md2CrAcct(ov4Md2CrAcct);
	}
	

	/**
	 * 	Update Ov4Md2CrAcct with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4Md2CrAcct(char[] value) throws CFException {
		 ov4Md2CrAcct = serializeOv4Md2CrAcct(value);
	}
	/**
	 * 	Update Ov4Md2CrAcct with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4Md2CrAcctString(char[] value) throws CFException {
		 setOv4Md2CrAcct(value);
	}
	/**
	 *	Returns the value of ov4Md2CrTc
	 *	@return ov4Md2CrTc
	 */
   public char[] getOv4Md2CrTc() throws CFException{
     if (isOv4Md2CrTcModified()) { 
        ov4Md2CrTc = refreshOv4Md2CrTc();
     }
   		return ov4Md2CrTc;
   }

  
	/**
	*  set variable ov4Md2CrTc
	*  Corresponding COBOL Variable is OV4-MD2-CR-TC
	*  @param value
	**/
   public void setOv4Md2CrTc(char[] value) {
      ov4Md2CrTc = checkOv4Md2CrTcConstraints(value);
      serializeOv4Md2CrTc(ov4Md2CrTc);
   } 

     /**
	 * 	Update Ov4Md2CrTc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md2CrTc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4Md2CrTc,ov4Md2CrTc.length);
   	
   }
   
   public void setOv4Md2CrTc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md2CrTc,ov4Md2CrTc.length);
   	
   }
   
     /**
	 * 	Update Ov4Md2CrTc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md2CrTc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md2CrTc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4Md2CrTc with another Field
	 *	@param value
	 */
   public void setOv4Md2CrTc(Field source) {
       replace(source,0,source.length(),beginOv4Md2CrTc,OV_4_MD_2_CR_TC_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4Md2CrTc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md2CrTc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4Md2CrTc,OV_4_MD_2_CR_TC_LEN);
   	
   }
   
     /**
	 * 	Update Ov4Md2CrTc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md2CrTc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md2CrTc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4Md2CrAmt
	 *	@return ov4Md2CrAmt
	 */
	public BigDecimal getOv4Md2CrAmt() throws CFException {
       if (isOv4Md2CrAmtModified()) { 
           ov4Md2CrAmt = refreshOv4Md2CrAmt();
        }
   		return ov4Md2CrAmt;
	}
	

	
	   
	/**
	 * 	Update Ov4Md2CrAmt with the passed number
	 *  Corresponding COBOL Variable is OV4-MD2-CR-AMT
	 *	@param number
	 */
	public void setOv4Md2CrAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4Md2CrAmt = checkOv4Md2CrAmtMaxLimit(number);
	    serializeOv4Md2CrAmt(ov4Md2CrAmt);
   }
	/**
	 * 	Update Ov4Md2CrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4Md2CrAmt(char[] value) throws CFException {
		 ov4Md2CrAmt = serializeOv4Md2CrAmt(value);
	}   

	
	
	

		public static int getOv4MiscData2FieldLength() {
			return OV_4_MISC_DATA_2_LENGTH;
		}

}
  
