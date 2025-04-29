package com.cloudframe.app.ip606130.dto;

/**
*  The class Table36Bsl600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Table36Bsl600 extends Table36Bsl600Serialized { 
   

						private char[] region600 = Field.fillLowValue(1);

						private char[] fromRegion600 = Field.fillLowValue(1);

						private char[] toRegion600 = Field.fillLowValue(1);

						private char[] accBrand600 = Field.fillLowValue(3);

								private int bsPriority600;

						private char[] busSrvLvl600 = Field.fillLowValue(1);

						private char[] busSrvId600 = Field.fillLowValue(6);

						private char[] bsLifecylInd600 = Field.fillLowValue(1);

						private char[] bsBsseCd600 = Field.fillLowValue(1);
	
	/**
	* Constructor for Table36Bsl600
	**/
    public Table36Bsl600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Table36Bsl600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Table36Bsl600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of region600
	 *	@return region600
	 */
   public char[] getRegion600() throws CFException{
     if (isRegion600Modified()) { 
        region600 = refreshRegion600();
     }
   		return region600;
   }

  
	/**
	*  set variable region600
	*  Corresponding COBOL Variable is 600-REGION
	*  @param value
	**/
   public void setRegion600(char[] value) {
      region600 = checkRegion600Constraints(value);
      serializeRegion600(region600);
   } 

     /**
	 * 	Update Region600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRegion600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRegion600,region600.length);
   	
   }
   
   public void setRegion600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRegion600,region600.length);
   	
   }
   
     /**
	 * 	Update Region600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRegion600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRegion600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Region600 with another Field
	 *	@param value
	 */
   public void setRegion600(Field source) {
       replace(source,0,source.length(),beginRegion600,REGION_600_LEN);
   	
   }  
   
     /**
	 * 	Update Region600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRegion600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRegion600,REGION_600_LEN);
   	
   }
   
     /**
	 * 	Update Region600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRegion600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRegion600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fromRegion600
	 *	@return fromRegion600
	 */
   public char[] getFromRegion600() throws CFException{
     if (isFromRegion600Modified()) { 
        fromRegion600 = refreshFromRegion600();
     }
   		return fromRegion600;
   }

  
	/**
	*  set variable fromRegion600
	*  Corresponding COBOL Variable is 600-FROM-REGION
	*  @param value
	**/
   public void setFromRegion600(char[] value) {
      fromRegion600 = checkFromRegion600Constraints(value);
      serializeFromRegion600(fromRegion600);
   } 

     /**
	 * 	Update FromRegion600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFromRegion600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFromRegion600,fromRegion600.length);
   	
   }
   
   public void setFromRegion600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFromRegion600,fromRegion600.length);
   	
   }
   
     /**
	 * 	Update FromRegion600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFromRegion600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFromRegion600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FromRegion600 with another Field
	 *	@param value
	 */
   public void setFromRegion600(Field source) {
       replace(source,0,source.length(),beginFromRegion600,FROM_REGION_600_LEN);
   	
   }  
   
     /**
	 * 	Update FromRegion600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFromRegion600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFromRegion600,FROM_REGION_600_LEN);
   	
   }
   
     /**
	 * 	Update FromRegion600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFromRegion600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFromRegion600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of toRegion600
	 *	@return toRegion600
	 */
   public char[] getToRegion600() throws CFException{
     if (isToRegion600Modified()) { 
        toRegion600 = refreshToRegion600();
     }
   		return toRegion600;
   }

  
	/**
	*  set variable toRegion600
	*  Corresponding COBOL Variable is 600-TO-REGION
	*  @param value
	**/
   public void setToRegion600(char[] value) {
      toRegion600 = checkToRegion600Constraints(value);
      serializeToRegion600(toRegion600);
   } 

     /**
	 * 	Update ToRegion600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setToRegion600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginToRegion600,toRegion600.length);
   	
   }
   
   public void setToRegion600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginToRegion600,toRegion600.length);
   	
   }
   
     /**
	 * 	Update ToRegion600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setToRegion600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginToRegion600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ToRegion600 with another Field
	 *	@param value
	 */
   public void setToRegion600(Field source) {
       replace(source,0,source.length(),beginToRegion600,TO_REGION_600_LEN);
   	
   }  
   
     /**
	 * 	Update ToRegion600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setToRegion600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginToRegion600,TO_REGION_600_LEN);
   	
   }
   
     /**
	 * 	Update ToRegion600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setToRegion600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginToRegion600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of accBrand600
	 *	@return accBrand600
	 */
   public char[] getAccBrand600() throws CFException{
     if (isAccBrand600Modified()) { 
        accBrand600 = refreshAccBrand600();
     }
   		return accBrand600;
   }

  
	/**
	*  set variable accBrand600
	*  Corresponding COBOL Variable is 600-ACC-BRAND
	*  @param value
	**/
   public void setAccBrand600(char[] value) {
      accBrand600 = checkAccBrand600Constraints(value);
      serializeAccBrand600(accBrand600);
   } 

     /**
	 * 	Update AccBrand600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccBrand600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAccBrand600,accBrand600.length);
   	
   }
   
   public void setAccBrand600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAccBrand600,accBrand600.length);
   	
   }
   
     /**
	 * 	Update AccBrand600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccBrand600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAccBrand600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AccBrand600 with another Field
	 *	@param value
	 */
   public void setAccBrand600(Field source) {
       replace(source,0,source.length(),beginAccBrand600,ACC_BRAND_600_LEN);
   	
   }  
   
     /**
	 * 	Update AccBrand600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccBrand600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAccBrand600,ACC_BRAND_600_LEN);
   	
   }
   
     /**
	 * 	Update AccBrand600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccBrand600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAccBrand600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bsPriority600
	 *	@return bsPriority600
	 */
	public int getBsPriority600() throws CFException {
       if (isBsPriority600Modified()) { 
           bsPriority600 = refreshBsPriority600();
        }
   		return bsPriority600;
	}
	

	
	   
	/**
	 * 	Update BsPriority600 with the passed value
	 *  Corresponding COBOL Variable is 600-BS-PRIORITY
	 *	@param number
	 */
	public void setBsPriority600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bsPriority600 = checkBsPriority600MaxLimit(number); 
		serializeBsPriority600(bsPriority600);
	}
	

	public void setBsPriority600(long number) {
	    number = checkBsPriority600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBsPriority600((int)number);
	}
	
	/**
	 * 	Update BsPriority600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBsPriority600(char[] value) throws CFException {
		 bsPriority600 = serializeBsPriority600(value);
	}
	/**
	 * 	Update BsPriority600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBsPriority600String(char[] value) throws CFException {
		 setBsPriority600(value);
	}
	/**
	 *	Returns the value of busSrvLvl600
	 *	@return busSrvLvl600
	 */
   public char[] getBusSrvLvl600() throws CFException{
     if (isBusSrvLvl600Modified()) { 
        busSrvLvl600 = refreshBusSrvLvl600();
     }
   		return busSrvLvl600;
   }

  
	/**
	*  set variable busSrvLvl600
	*  Corresponding COBOL Variable is 600-BUS-SRV-LVL
	*  @param value
	**/
   public void setBusSrvLvl600(char[] value) {
      busSrvLvl600 = checkBusSrvLvl600Constraints(value);
      serializeBusSrvLvl600(busSrvLvl600);
   } 

     /**
	 * 	Update BusSrvLvl600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBusSrvLvl600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBusSrvLvl600,busSrvLvl600.length);
   	
   }
   
   public void setBusSrvLvl600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBusSrvLvl600,busSrvLvl600.length);
   	
   }
   
     /**
	 * 	Update BusSrvLvl600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBusSrvLvl600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusSrvLvl600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BusSrvLvl600 with another Field
	 *	@param value
	 */
   public void setBusSrvLvl600(Field source) {
       replace(source,0,source.length(),beginBusSrvLvl600,BUS_SRV_LVL_600_LEN);
   	
   }  
   
     /**
	 * 	Update BusSrvLvl600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBusSrvLvl600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBusSrvLvl600,BUS_SRV_LVL_600_LEN);
   	
   }
   
     /**
	 * 	Update BusSrvLvl600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBusSrvLvl600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusSrvLvl600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of busSrvId600
	 *	@return busSrvId600
	 */
   public char[] getBusSrvId600() throws CFException{
     if (isBusSrvId600Modified()) { 
        busSrvId600 = refreshBusSrvId600();
     }
   		return busSrvId600;
   }

  
	/**
	*  set variable busSrvId600
	*  Corresponding COBOL Variable is 600-BUS-SRV-ID
	*  @param value
	**/
   public void setBusSrvId600(char[] value) {
      busSrvId600 = checkBusSrvId600Constraints(value);
      serializeBusSrvId600(busSrvId600);
   } 

     /**
	 * 	Update BusSrvId600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBusSrvId600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBusSrvId600,busSrvId600.length);
   	
   }
   
   public void setBusSrvId600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBusSrvId600,busSrvId600.length);
   	
   }
   
     /**
	 * 	Update BusSrvId600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBusSrvId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusSrvId600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BusSrvId600 with another Field
	 *	@param value
	 */
   public void setBusSrvId600(Field source) {
       replace(source,0,source.length(),beginBusSrvId600,BUS_SRV_ID_600_LEN);
   	
   }  
   
     /**
	 * 	Update BusSrvId600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBusSrvId600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBusSrvId600,BUS_SRV_ID_600_LEN);
   	
   }
   
     /**
	 * 	Update BusSrvId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBusSrvId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusSrvId600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bsLifecylInd600
	 *	@return bsLifecylInd600
	 */
   public char[] getBsLifecylInd600() throws CFException{
     if (isBsLifecylInd600Modified()) { 
        bsLifecylInd600 = refreshBsLifecylInd600();
     }
   		return bsLifecylInd600;
   }

  
	/**
	*  set variable bsLifecylInd600
	*  Corresponding COBOL Variable is 600-BS-LIFECYL-IND
	*  @param value
	**/
   public void setBsLifecylInd600(char[] value) {
      bsLifecylInd600 = checkBsLifecylInd600Constraints(value);
      serializeBsLifecylInd600(bsLifecylInd600);
   } 

     /**
	 * 	Update BsLifecylInd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsLifecylInd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsLifecylInd600,bsLifecylInd600.length);
   	
   }
   
   public void setBsLifecylInd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsLifecylInd600,bsLifecylInd600.length);
   	
   }
   
     /**
	 * 	Update BsLifecylInd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsLifecylInd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsLifecylInd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BsLifecylInd600 with another Field
	 *	@param value
	 */
   public void setBsLifecylInd600(Field source) {
       replace(source,0,source.length(),beginBsLifecylInd600,BS_LIFECYL_IND_600_LEN);
   	
   }  
   
     /**
	 * 	Update BsLifecylInd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsLifecylInd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsLifecylInd600,BS_LIFECYL_IND_600_LEN);
   	
   }
   
     /**
	 * 	Update BsLifecylInd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsLifecylInd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsLifecylInd600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bsBsseCd600
	 *	@return bsBsseCd600
	 */
   public char[] getBsBsseCd600() throws CFException{
     if (isBsBsseCd600Modified()) { 
        bsBsseCd600 = refreshBsBsseCd600();
     }
   		return bsBsseCd600;
   }

  
	/**
	*  set variable bsBsseCd600
	*  Corresponding COBOL Variable is 600-BS-BSSE-CD
	*  @param value
	**/
   public void setBsBsseCd600(char[] value) {
      bsBsseCd600 = checkBsBsseCd600Constraints(value);
      serializeBsBsseCd600(bsBsseCd600);
   } 

     /**
	 * 	Update BsBsseCd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsBsseCd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsBsseCd600,bsBsseCd600.length);
   	
   }
   
   public void setBsBsseCd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsBsseCd600,bsBsseCd600.length);
   	
   }
   
     /**
	 * 	Update BsBsseCd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsBsseCd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsBsseCd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BsBsseCd600 with another Field
	 *	@param value
	 */
   public void setBsBsseCd600(Field source) {
       replace(source,0,source.length(),beginBsBsseCd600,BS_BSSE_CD_600_LEN);
   	
   }  
   
     /**
	 * 	Update BsBsseCd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsBsseCd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsBsseCd600,BS_BSSE_CD_600_LEN);
   	
   }
   
     /**
	 * 	Update BsBsseCd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsBsseCd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsBsseCd600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTable36Bsl600FieldLength() {
			return TABLE_36_BSL_600_LENGTH;
		}

}
  
