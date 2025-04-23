package com.cloudframe.app.ip989010.dto;

/**
*  The class Parms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parms1000 extends Parms1000Serialized {
   

								private short parmLength1000;
				private ParmData1000 parmData1000 = new ParmData1000();
	
	/**
	* Constructor for Parms1000
	**/
    public Parms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			parmData1000.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLength1000
	 *	@return parmLength1000
	 */
	public short getParmLength1000() throws CFException {
        if (isParmLength1000Modified()) { 
           parmLength1000 = refreshParmLength1000();
        }
   		return parmLength1000;
	}
	
	/**
	 * 	Update ParmLength1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-PARM-LENGTH
	 *	@param number
	 */
	public void setParmLength1000(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLength1000 = checkParmLength1000MaxLimit(number); 
		serializeParmLength1000(parmLength1000);
	}

	public void setParmLength1000(int number) {
	    number = checkParmLength1000MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLength1000((short)number);
	}
	public void setParmLength1000(long number) {
	    number = checkParmLength1000MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLength1000((short)number);
	}
	

	/**
	 *	Returns the value of parmData1000
	 *	@return parmData1000
	 */   
	 public ParmData1000 getParmData1000() {
   	return parmData1000;
   }
   /**
	* 	Update ParmData1000 with the passed value
	*   Corresponding COBOL Variable is 1000-PARM-DATA
	*	@param value
	*/
   public void setParmData1000(char[] value) {
      parmData1000.setString(value); 
   }   
    
     /**
	 * 	Update ParmData1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParmData1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parmData1000.begin,parmData1000.length());
   }
   
     /**
	 * 	Update ParmData1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parmData1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ParmData1000 with another Field
	 *	@param value
	 */
   public void setParmData1000(Field source) {
   	replace(source,0,source.length(),parmData1000.begin,parmData1000.length());
   }  
   
     /**
	 * 	Update ParmData1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParmData1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parmData1000.begin,parmData1000.length());
   }
   
     /**
	 * 	Update ParmData1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parmData1000.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getParms1000FieldLength() {
			return PARMS_1000_LENGTH;
		}

}
  
