package com.cloudframe.app.ip989010.dto;

/**
*  The class TotalRecsWrittenMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class TotalRecsWrittenMsg600 extends TotalRecsWrittenMsg600Serialized { 
   




						private char[] recsWritDd600 = new char[6];


								private char[] recsWritCount600 = new char[11];
							
	
	/**
	* Constructor for TotalRecsWrittenMsg600
	**/
    public TotalRecsWrittenMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP989010").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-0901-").toCharArray()
             , getStartOffset() + 8
             ,6
             );
       replaceValue( // serialize and save the value
             ("TOTAL RECORDS WRITTEN TO ").toCharArray()
             , getStartOffset() + 14
             ,25
             );
								setRecsWritDd600(fillSpace(6));
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 45
             ,2
             );
								setRecsWritCount600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of recsWritDd600
	 *	@return recsWritDd600
	 */
   public char[] getRecsWritDd600() throws CFException{
     if (isRecsWritDd600Modified()) { 
        recsWritDd600 = refreshRecsWritDd600();
     }
   		return recsWritDd600;
   }

  
	/**
	*  set variable recsWritDd600
	*  Corresponding COBOL Variable is 600-RECS-WRIT-DD
	*  @param value
	**/
   public void setRecsWritDd600(char[] value) {
      recsWritDd600 = checkRecsWritDd600Constraints(value);
      serializeRecsWritDd600(recsWritDd600);
   } 

     /**
	 * 	Update RecsWritDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecsWritDd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecsWritDd600,recsWritDd600.length);
   	
   }
   
   public void setRecsWritDd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecsWritDd600,recsWritDd600.length);
   	
   }
   
     /**
	 * 	Update RecsWritDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecsWritDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsWritDd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecsWritDd600 with another Field
	 *	@param value
	 */
   public void setRecsWritDd600(Field source) {
       replace(source,0,source.length(),beginRecsWritDd600,RECS_WRIT_DD_600_LEN);
   	
   }  
   
     /**
	 * 	Update RecsWritDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecsWritDd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecsWritDd600,RECS_WRIT_DD_600_LEN);
   	
   }
   
     /**
	 * 	Update RecsWritDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecsWritDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsWritDd600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recsWritCount600
	 *	@return recsWritCount600
	 */
   public char[] getRecsWritCount600() throws CFException{
     if (isRecsWritCount600Modified()) { 
        recsWritCount600 = refreshRecsWritCount600();
     }
   		return recsWritCount600;
   }

  
	/**
	*  set variable recsWritCount600
	*  Corresponding COBOL Variable is 600-RECS-WRIT-COUNT
	*  @param value
	**/
   public void setRecsWritCount600(char[] value) {
      recsWritCount600 = checkRecsWritCount600Constraints(value);
      serializeRecsWritCount600(recsWritCount600);
   } 

     /**
	 * 	Update RecsWritCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecsWritCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecsWritCount600,recsWritCount600.length);
   	
   }
   
   public void setRecsWritCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecsWritCount600,recsWritCount600.length);
   	
   }
   
     /**
	 * 	Update RecsWritCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecsWritCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsWritCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecsWritCount600 with another Field
	 *	@param value
	 */
   public void setRecsWritCount600(Field source) {
       replace(source,0,source.length(),beginRecsWritCount600,RECS_WRIT_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update RecsWritCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecsWritCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecsWritCount600,RECS_WRIT_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update RecsWritCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecsWritCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsWritCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotalRecsWrittenMsg600FieldLength() {
			return TOTAL_RECS_WRITTEN_MSG_600_LENGTH;
		}

}
  
