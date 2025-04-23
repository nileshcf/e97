package com.cloudframe.app.mcissues.dto;

/**
*  The class PeVersionNumMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PeVersionNumMsg600 extends PeVersionNumMsg600Serialized {
   


						private char[] peVersionNum600 = new char[7];


								private long mpeVersionNum600;

	
	/**
	* Constructor for PeVersionNumMsg600
	**/
    public PeVersionNumMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PREEDIT SOFTWARE VERSION=").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setPeVersionNum600(fillSpace(7));
       replaceValue( // serialize and save the value
             ("MEMBER PROFILE VERSION=  ").toCharArray()
             , getStartOffset() + 32
             ,25
             );
								setMpeVersionNum600(0L);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 65
             ,1
             );
    }


 

	/**
	 *	Returns the value of peVersionNum600
	 *	@return peVersionNum600
	 */
   public char[] getPeVersionNum600() throws CFException{
     if (isPeVersionNum600Modified()) { 
        peVersionNum600 = refreshPeVersionNum600();
     }
   		return peVersionNum600;
   }

  
	/**
	*  set variable peVersionNum600
	*  Corresponding COBOL Variable is 600-PE-VERSION-NUM
	*  @param value
	**/
   public void setPeVersionNum600(char[] value) {
      peVersionNum600 = checkPeVersionNum600Constraints(value);
      serializePeVersionNum600(peVersionNum600);
   } 

     /**
	 * 	Update PeVersionNum600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeVersionNum600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPeVersionNum600,peVersionNum600.length);
   	
   }
   
   public void setPeVersionNum600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPeVersionNum600,peVersionNum600.length);
   	
   }
   
     /**
	 * 	Update PeVersionNum600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeVersionNum600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeVersionNum600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PeVersionNum600 with another Field
	 *	@param value
	 */
   public void setPeVersionNum600(Field source) {
       replace(source,0,source.length(),beginPeVersionNum600,PE_VERSION_NUM_600_LEN);
   	
   }  
   
     /**
	 * 	Update PeVersionNum600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeVersionNum600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPeVersionNum600,PE_VERSION_NUM_600_LEN);
   	
   }
   
     /**
	 * 	Update PeVersionNum600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeVersionNum600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeVersionNum600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mpeVersionNum600
	 *	@return mpeVersionNum600
	 */
	public long getMpeVersionNum600() throws CFException {
       if (isMpeVersionNum600Modified()) { 
           mpeVersionNum600 = refreshMpeVersionNum600();
        }
   		return mpeVersionNum600;
	}
	

	
	   
	/**
	 * 	Update MpeVersionNum600 with the passed value
	 *  Corresponding COBOL Variable is 600-MPE-VERSION-NUM
	 *	@param number
	 */
	public void setMpeVersionNum600(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    mpeVersionNum600 = checkMpeVersionNum600MaxLimit(number); 
		serializeMpeVersionNum600(mpeVersionNum600);
	}
	

	/**
	 * 	Update MpeVersionNum600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMpeVersionNum600(char[] value) throws CFException {
		 mpeVersionNum600 = serializeMpeVersionNum600(value);
	}
	/**
	 * 	Update MpeVersionNum600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMpeVersionNum600String(char[] value) throws CFException {
		 setMpeVersionNum600(value);
	}

	
	
	

		public static int getPeVersionNumMsg600FieldLength() {
			return PE_VERSION_NUM_MSG_600_LENGTH;
		}

}
  
