package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaHdrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlhzaHdrRecord extends RlhzaHdrRecordSerialized { 
   

								private long rlhzaRcBlAsOfDtIso;
				private RlhzaFiller02 rlhzaFiller02 = new RlhzaFiller02();
	
	/**
	* Constructor for RlhzaHdrRecord
	**/
    public RlhzaHdrRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlhzaHdrRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaHdrRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rlhzaFiller02.setParent(this,getStartOffset() + 12);
    } 

	/**
	 *	Returns the value of rlhzaRcBlAsOfDtIso
	 *	@return rlhzaRcBlAsOfDtIso
	 */
	public long getRlhzaRcBlAsOfDtIso() throws CFException {
       if (isRlhzaRcBlAsOfDtIsoModified()) { 
           rlhzaRcBlAsOfDtIso = refreshRlhzaRcBlAsOfDtIso();
        }
   		return rlhzaRcBlAsOfDtIso;
	}
	

	
	   
	/**
	 * 	Update RlhzaRcBlAsOfDtIso with the passed value
	 *  Corresponding COBOL Variable is RLHZA-RC-BL-AS-OF-DT-ISO
	 *	@param number
	 */
	public void setRlhzaRcBlAsOfDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlhzaRcBlAsOfDtIso = checkRlhzaRcBlAsOfDtIsoMaxLimit(number); 
		serializeRlhzaRcBlAsOfDtIso(rlhzaRcBlAsOfDtIso);
	}
	

	/**
	 * 	Update RlhzaRcBlAsOfDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlhzaRcBlAsOfDtIso(char[] value) throws CFException {
		 rlhzaRcBlAsOfDtIso = serializeRlhzaRcBlAsOfDtIso(value);
	}
	/**
	 * 	Update RlhzaRcBlAsOfDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlhzaRcBlAsOfDtIsoString(char[] value) throws CFException {
		 setRlhzaRcBlAsOfDtIso(value);
	}
	/**
	 *	Returns the value of rlhzaFiller02
	 *	@return rlhzaFiller02
	 */   
	 public RlhzaFiller02 getRlhzaFiller02() {
   	return rlhzaFiller02;
   }
   /**
	* 	Update RlhzaFiller02 with the passed value
	*   Corresponding COBOL Variable is RLHZA-FILLER
	*	@param value
	*/
   public void setRlhzaFiller02(char[] value) {
      rlhzaFiller02.setString(value); 
   }   
    
     /**
	 * 	Update RlhzaFiller02 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlhzaFiller02(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaFiller02.begin,rlhzaFiller02.length());
   }
   
     /**
	 * 	Update RlhzaFiller02 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaFiller02.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlhzaFiller02 with another Field
	 *	@param value
	 */
   public void setRlhzaFiller02(Field source) {
   	replace(source,0,source.length(),rlhzaFiller02.begin,rlhzaFiller02.length());
   }  
   
     /**
	 * 	Update RlhzaFiller02 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlhzaFiller02(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaFiller02.begin,rlhzaFiller02.length());
   }
   
     /**
	 * 	Update RlhzaFiller02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaFiller02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaFiller02.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlhzaHdrRecordFieldLength() {
			return RLHZA_HDR_RECORD_LENGTH;
		}

}
  
