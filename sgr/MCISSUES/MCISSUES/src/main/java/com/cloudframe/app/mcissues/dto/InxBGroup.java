package com.cloudframe.app.mcissues.dto;

/**
*  The class InxBGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InxBGroup extends InxBGroupSerialized {
   

								private int inxB;

								private long inxBBin;

						private char[] inxBChr = Field.fillLowValue(4);
	
	/**
	* Constructor for InxBGroup
	**/
    public InxBGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inxB
	 *	@return inxB
	 */
	public int getInxB() throws CFException {
        if (isInxBModified()) { 
           inxB = refreshInxB();
        }
   		return inxB;
	}
	
	/**
	 * 	Update InxB with the passed value
	 *  Corresponding COBOL Variable is INX-B
	 *	@param number
	 */
	public void setInxB(int number) {
	     // Truncate if the number is beyond +/- Max range
	    inxB = checkInxBMaxLimit(number); 
		serializeInxB(inxB);
	}


	public void setInxB(long number) {
	    number = checkInxBMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInxB((int)number);
	}
	
	/**
	 *	Returns the value of inxBBin
	 *	@return inxBBin
	 */
	public long getInxBBin() throws CFException {
        if (isInxBBinModified()) { 
           inxBBin = refreshInxBBin();
        }
   		return inxBBin;
	}
	
	/**
	 * 	Update InxBBin with the passed value
	 *  Corresponding COBOL Variable is INX-B-BIN
	 *	@param number
	 */
	public void setInxBBin(long number) {
	     // Truncate if the number is beyond +/- Max range
	    inxBBin = checkInxBBinMaxLimit(number); 
		serializeInxBBin(inxBBin);
	}


	/**
	 *	Returns the value of inxBChr
	 *	@return inxBChr
	 */
   public char[] getInxBChr() throws CFException{
     if (isInxBChrModified()) { 
        inxBChr = refreshInxBChr();
     }
   		return inxBChr;
   }

  
	/**
	*  set variable inxBChr
	*  Corresponding COBOL Variable is INX-B-CHR
	*  @param value
	**/
   public void setInxBChr(char[] value) {
      inxBChr = checkInxBChrConstraints(value);
      serializeInxBChr(inxBChr);
   } 

     /**
	 * 	Update InxBChr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInxBChr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInxBChr,inxBChr.length);
   	
   }
   
   public void setInxBChr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInxBChr,inxBChr.length);
   	
   }
   
     /**
	 * 	Update InxBChr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInxBChr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInxBChr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InxBChr with another Field
	 *	@param value
	 */
   public void setInxBChr(Field source) {
       replace(source,0,source.length(),beginInxBChr,INX_BCHR_LEN);
   	
   }  
   
     /**
	 * 	Update InxBChr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInxBChr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInxBChr,INX_BCHR_LEN);
   	
   }
   
     /**
	 * 	Update InxBChr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInxBChr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInxBChr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInxBGroupFieldLength() {
			return INX_BGROUP_LENGTH;
		}

}
  
