package com.cloudframe.app.init1.dto;

/**
*  The class IypInit9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IypInit9 extends IypInit9Serialized { 
   

								private int filler4;

								private int filler5;
				private IypPriorTbl9 iypPriorTbl9 = new IypPriorTbl9();
	
	/**
	* Constructor for IypInit9
	**/
    public IypInit9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypInit9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			iypPriorTbl9.setParent(this,getStartOffset() + 8);
    } 

	/**
	 *	Returns the value of filler4
	 *	@return filler4
	 */
	public int getFiller4() throws CFException {
        if (isFiller4Modified()) { 
           filler4 = refreshFiller4();
        }
   		return filler4;
	}
	
	/**
	 * 	Update Filler4 with the passed value
	 *  Corresponding COBOL Variable is FILLER4
	 *	@param number
	 */
	public void setFiller4(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filler4 = checkFiller4MaxLimit(number); 
		serializeFiller4(filler4);
	}


	public void setFiller4(long number) {
	    number = checkFiller4MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFiller4((int)number);
	}
	
	/**
	 *	Returns the value of filler5
	 *	@return filler5
	 */
	public int getFiller5() throws CFException {
        if (isFiller5Modified()) { 
           filler5 = refreshFiller5();
        }
   		return filler5;
	}
	
	/**
	 * 	Update Filler5 with the passed value
	 *  Corresponding COBOL Variable is FILLER5
	 *	@param number
	 */
	public void setFiller5(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filler5 = checkFiller5MaxLimit(number); 
		serializeFiller5(filler5);
	}


	public void setFiller5(long number) {
	    number = checkFiller5MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFiller5((int)number);
	}
	
	/**
	 *	Returns the value of iypPriorTbl9
	 *	@return iypPriorTbl9
	 */   
	 public IypPriorTbl9 getIypPriorTbl9() {
   	return iypPriorTbl9;
   }
   /**
	* 	Update IypPriorTbl9 with the passed value
	*   Corresponding COBOL Variable is WS-9IYP-PRIOR-TBL
	*	@param value
	*/
   public void setIypPriorTbl9(char[] value) {
      iypPriorTbl9.setString(value); 
   }   
    
     /**
	 * 	Update IypPriorTbl9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl9.begin,iypPriorTbl9.length());
   }
   
     /**
	 * 	Update IypPriorTbl9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypPriorTbl9 with another Field
	 *	@param value
	 */
   public void setIypPriorTbl9(Field source) {
   	replace(source,0,source.length(),iypPriorTbl9.begin,iypPriorTbl9.length());
   }  
   
     /**
	 * 	Update IypPriorTbl9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl9.begin,iypPriorTbl9.length());
   }
   
     /**
	 * 	Update IypPriorTbl9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl9.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes IypInit9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypPriorTbl9.initialize();
     
   }

		public static int getIypInit9FieldLength() {
			return IYP_INIT_9_LENGTH;
		}

}
  
