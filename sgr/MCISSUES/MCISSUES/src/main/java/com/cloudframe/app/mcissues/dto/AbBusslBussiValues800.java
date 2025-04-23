package com.cloudframe.app.mcissues.dto;

/**
*  The class AbBusslBussiValues800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AbBusslBussiValues800 extends AbBusslBussiValues800Serialized {
   

						private char[] ab800 = new char[3];

								private int bussl800;

								private int bussi800;
	
	/**
	* Constructor for AbBusslBussiValues800
	**/
    public AbBusslBussiValues800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAb800(fillSpace(3));
								setBussl800(0);
								setBussi800(0);
    }


 

	/**
	 *	Returns the value of ab800
	 *	@return ab800
	 */
   public char[] getAb800() throws CFException{
     if (isAb800Modified()) { 
        ab800 = refreshAb800();
     }
   		return ab800;
   }

  
	/**
	*  set variable ab800
	*  Corresponding COBOL Variable is 800-AB
	*  @param value
	**/
   public void setAb800(char[] value) {
      ab800 = checkAb800Constraints(value);
      serializeAb800(ab800);
   } 

     /**
	 * 	Update Ab800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAb800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAb800,ab800.length);
   	
   }
   
   public void setAb800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAb800,ab800.length);
   	
   }
   
     /**
	 * 	Update Ab800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAb800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAb800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ab800 with another Field
	 *	@param value
	 */
   public void setAb800(Field source) {
       replace(source,0,source.length(),beginAb800,AB_800_LEN);
   	
   }  
   
     /**
	 * 	Update Ab800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAb800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAb800,AB_800_LEN);
   	
   }
   
     /**
	 * 	Update Ab800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAb800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAb800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bussl800
	 *	@return bussl800
	 */
	public int getBussl800() throws CFException {
       if (isBussl800Modified()) { 
           bussl800 = refreshBussl800();
        }
   		return bussl800;
	}
	

	
	   
	/**
	 * 	Update Bussl800 with the passed value
	 *  Corresponding COBOL Variable is 800-BUSSL
	 *	@param number
	 */
	public void setBussl800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bussl800 = checkBussl800MaxLimit(number); 
		serializeBussl800(bussl800);
	}
	

	public void setBussl800(long number) {
	    number = checkBussl800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBussl800((int)number);
	}
	
	/**
	 * 	Update Bussl800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBussl800(char[] value) throws CFException {
		 bussl800 = serializeBussl800(value);
	}
	/**
	 * 	Update Bussl800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBussl800String(char[] value) throws CFException {
		 setBussl800(value);
	}
	/**
	 *	Returns the value of bussi800
	 *	@return bussi800
	 */
	public int getBussi800() throws CFException {
       if (isBussi800Modified()) { 
           bussi800 = refreshBussi800();
        }
   		return bussi800;
	}
	

	
	   
	/**
	 * 	Update Bussi800 with the passed value
	 *  Corresponding COBOL Variable is 800-BUSSI
	 *	@param number
	 */
	public void setBussi800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bussi800 = checkBussi800MaxLimit(number); 
		serializeBussi800(bussi800);
	}
	

	public void setBussi800(long number) {
	    number = checkBussi800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBussi800((int)number);
	}
	
	/**
	 * 	Update Bussi800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBussi800(char[] value) throws CFException {
		 bussi800 = serializeBussi800(value);
	}
	/**
	 * 	Update Bussi800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBussi800String(char[] value) throws CFException {
		 setBussi800(value);
	}

	
	
	
	/**
	 * 	initializes AbBusslBussiValues800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAb800(CONSTANTS.SPACE_3);
                     setBussl800(0);
                     setBussi800(0);
   }

		public static int getAbBusslBussiValues800FieldLength() {
			return AB_BUSSL_BUSSI_VALUES_800_LENGTH;
		}

}
  
