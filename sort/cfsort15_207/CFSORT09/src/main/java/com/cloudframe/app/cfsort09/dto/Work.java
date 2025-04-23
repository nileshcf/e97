package com.cloudframe.app.cfsort09.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort09.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private int i;

								private int j;

								private char[] dispI = Field.fillLowValue(19);

								private long dispJ;

						private char[] displayFileStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setI(0);
								setJ(0);
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(int number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}


	public void setI(long number) {
	    number = checkIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setI((int)number);
	}
	
	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public int getJ() throws CFException {
   		return j;
	}
	
	/**
	 * 	Update J with the passed value
	 *  Corresponding COBOL Variable is J
	 *	@param number
	 */
	public void setJ(int number) {
	     // Truncate if the number is beyond +/- Max range
	    j = checkJMaxLimit(number); 
	}


	public void setJ(long number) {
	    number = checkJMaxLimit(number); // Truncate if value is beyond +/- Max range
		setJ((int)number);
	}
	
	/**
	 *	Returns the value of dispI
	 *	@return dispI
	 */
   public char[] getDispI() throws CFException{
     if (isDispIModified()) { 
        dispI = refreshDispI();
     }
   		return dispI;
   }

  
	/**
	*  set variable dispI
	*  Corresponding COBOL Variable is DISP-I
	*  @param value
	**/
   public void setDispI(char[] value) {
      dispI = checkDispIConstraints(value);
      serializeDispI(dispI);
   } 

     /**
	 * 	Update DispI 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDispI(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDispI,dispI.length);
   	
   }
   
   public void setDispI(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDispI,dispI.length);
   	
   }
   
     /**
	 * 	Update DispI 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDispI(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDispI+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DispI with another Field
	 *	@param value
	 */
   public void setDispI(Field source) {
       replace(source,0,source.length(),beginDispI,DISP_I_LEN);
   	
   }  
   
     /**
	 * 	Update DispI 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDispI(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDispI,DISP_I_LEN);
   	
   }
   
     /**
	 * 	Update DispI 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDispI(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDispI+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dispJ
	 *	@return dispJ
	 */
	public long getDispJ() throws CFException {
       if (isDispJModified()) { 
           dispJ = refreshDispJ();
        }
   		return dispJ;
	}
	

	
	   
	/**
	 * 	Update DispJ with the passed value
	 *  Corresponding COBOL Variable is DISP-J
	 *	@param number
	 */
	public void setDispJ(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dispJ = checkDispJMaxLimit(number); 
		serializeDispJ(dispJ);
	}
	

	/**
	 * 	Update DispJ with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispJ(char[] value) throws CFException {
		 dispJ = serializeDispJ(value);
	}
	/**
	 * 	Update DispJ with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispJString(char[] value) throws CFException {
		 setDispJ(value);
	}
	/**
	 *	Returns the value of displayFileStatus
	 *	@return displayFileStatus
	 */
   public char[] getDisplayFileStatus() throws CFException{
   		return displayFileStatus;
   }

  
	/**
	*  set variable displayFileStatus
	*  Corresponding COBOL Variable is WS-DISPLAY-FILE-STATUS
	*  @param value
	**/
   public void setDisplayFileStatus(char[] value) {
       value = checkDisplayFileStatusConstraints(value);
       arraycopy(value,0,displayFileStatus,0,value.length);
   } 
	public void setDisplayFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,displayFileStatus,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
