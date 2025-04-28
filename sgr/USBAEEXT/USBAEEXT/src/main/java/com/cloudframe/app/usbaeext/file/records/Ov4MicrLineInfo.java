package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4MicrLineInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Ov4MicrLineInfo extends Ov4MicrLineInfoSerialized { 
   
				private Ov4Aba ov4Aba = new Ov4Aba();

						private char[] ov4AcctAppl = Field.fillLowValue(1);

								private long ov4AcctNo;

						private char[] ov4AmntSign = Field.fillLowValue(1);

								private BigDecimal ov4Amnt = BigDecimal.ZERO;

	
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
	       			ov4Aba.setParent(this,getStartOffset() + 0);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 47
             ,20
             );
    } 

	/**
	 *	Returns the value of ov4Aba
	 *	@return ov4Aba
	 */   
	 public Ov4Aba getOv4Aba() {
   	return ov4Aba;
   }
   /**
	* 	Update Ov4Aba with the passed value
	*   Corresponding COBOL Variable is OV4-ABA
	*	@param value
	*/
   public void setOv4Aba(char[] value) {
      ov4Aba.setString(value); 
   }   
    
     /**
	 * 	Update Ov4Aba 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOv4Aba(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4Aba.begin,ov4Aba.length());
   }
   
     /**
	 * 	Update Ov4Aba 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Aba(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4Aba.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ov4Aba with another Field
	 *	@param value
	 */
   public void setOv4Aba(Field source) {
   	replace(source,0,source.length(),ov4Aba.begin,ov4Aba.length());
   }  
   
     /**
	 * 	Update Ov4Aba 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOv4Aba(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ov4Aba.begin,ov4Aba.length());
   }
   
     /**
	 * 	Update Ov4Aba 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Aba(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ov4Aba.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ov4AcctAppl
	 *	@return ov4AcctAppl
	 */
   public char[] getOv4AcctAppl() throws CFException{
     if (isOv4AcctApplModified()) { 
        ov4AcctAppl = refreshOv4AcctAppl();
     }
   		return ov4AcctAppl;
   }

  
	/**
	*  set variable ov4AcctAppl
	*  Corresponding COBOL Variable is OV4-ACCT-APPL
	*  @param value
	**/
   public void setOv4AcctAppl(char[] value) {
      ov4AcctAppl = checkOv4AcctApplConstraints(value);
      serializeOv4AcctAppl(ov4AcctAppl);
   } 

     /**
	 * 	Update Ov4AcctAppl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AcctAppl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4AcctAppl,ov4AcctAppl.length);
   	
   }
   
   public void setOv4AcctAppl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AcctAppl,ov4AcctAppl.length);
   	
   }
   
     /**
	 * 	Update Ov4AcctAppl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctAppl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AcctAppl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4AcctAppl with another Field
	 *	@param value
	 */
   public void setOv4AcctAppl(Field source) {
       replace(source,0,source.length(),beginOv4AcctAppl,OV_4_ACCT_APPL_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4AcctAppl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AcctAppl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4AcctAppl,OV_4_ACCT_APPL_LEN);
   	
   }
   
     /**
	 * 	Update Ov4AcctAppl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AcctAppl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AcctAppl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4AcctNo
	 *	@return ov4AcctNo
	 */
	public long getOv4AcctNo() throws CFException {
       if (isOv4AcctNoModified()) { 
           ov4AcctNo = refreshOv4AcctNo();
        }
   		return ov4AcctNo;
	}
	

	
	   
	/**
	 * 	Update Ov4AcctNo with the passed value
	 *  Corresponding COBOL Variable is OV4-ACCT-NO
	 *	@param number
	 */
	public void setOv4AcctNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4AcctNo = checkOv4AcctNoMaxLimit(number); 
		serializeOv4AcctNo(ov4AcctNo);
	}
	

	/**
	 * 	Update Ov4AcctNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4AcctNo(char[] value) throws CFException {
		 ov4AcctNo = serializeOv4AcctNo(value);
	}
	/**
	 * 	Update Ov4AcctNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4AcctNoString(char[] value) throws CFException {
		 setOv4AcctNo(value);
	}
	/**
	 *	Returns the value of ov4AmntSign
	 *	@return ov4AmntSign
	 */
   public char[] getOv4AmntSign() throws CFException{
     if (isOv4AmntSignModified()) { 
        ov4AmntSign = refreshOv4AmntSign();
     }
   		return ov4AmntSign;
   }

  
	/**
	*  set variable ov4AmntSign
	*  Corresponding COBOL Variable is OV4-AMNT-SIGN
	*  @param value
	**/
   public void setOv4AmntSign(char[] value) {
      ov4AmntSign = checkOv4AmntSignConstraints(value);
      serializeOv4AmntSign(ov4AmntSign);
   } 

     /**
	 * 	Update Ov4AmntSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AmntSign(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4AmntSign,ov4AmntSign.length);
   	
   }
   
   public void setOv4AmntSign(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AmntSign,ov4AmntSign.length);
   	
   }
   
     /**
	 * 	Update Ov4AmntSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AmntSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AmntSign+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4AmntSign with another Field
	 *	@param value
	 */
   public void setOv4AmntSign(Field source) {
       replace(source,0,source.length(),beginOv4AmntSign,OV_4_AMNT_SIGN_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4AmntSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AmntSign(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4AmntSign,OV_4_AMNT_SIGN_LEN);
   	
   }
   
     /**
	 * 	Update Ov4AmntSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AmntSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AmntSign+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4Amnt
	 *	@return ov4Amnt
	 */
	public BigDecimal getOv4Amnt() throws CFException {
       if (isOv4AmntModified()) { 
           ov4Amnt = refreshOv4Amnt();
        }
   		return ov4Amnt;
	}
	

	
	   
	/**
	 * 	Update Ov4Amnt with the passed number
	 *  Corresponding COBOL Variable is OV4-AMNT
	 *	@param number
	 */
	public void setOv4Amnt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4Amnt = checkOv4AmntMaxLimit(number);
	    serializeOv4Amnt(ov4Amnt);
   }
	/**
	 * 	Update Ov4Amnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4Amnt(char[] value) throws CFException {
		 ov4Amnt = serializeOv4Amnt(value);
	}   

	
	
	

		public static int getOv4MicrLineInfoFieldLength() {
			return OV_4_MICR_LINE_INFO_LENGTH;
		}

}
  
