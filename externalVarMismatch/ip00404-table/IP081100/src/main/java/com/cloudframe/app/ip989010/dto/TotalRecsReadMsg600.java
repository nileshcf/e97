package com.cloudframe.app.ip989010.dto;

/**
*  The class TotalRecsReadMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class TotalRecsReadMsg600 extends TotalRecsReadMsg600Serialized {
   




						private char[] recsReadDd600 = new char[6];


								private char[] recsReadCount600 = new char[11];
							
	
	/**
	* Constructor for TotalRecsReadMsg600
	**/
    public TotalRecsReadMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP989010").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-0900-").toCharArray()
             , getStartOffset() + 8
             ,6
             );
       replaceValue( // serialize and save the value
             ("TOTAL RECORDS READ FROM ").toCharArray()
             , getStartOffset() + 14
             ,24
             );
								setRecsReadDd600(fillSpace(6));
       replaceValue( // serialize and save the value
             (" : ").toCharArray()
             , getStartOffset() + 44
             ,3
             );
								setRecsReadCount600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of recsReadDd600
	 *	@return recsReadDd600
	 */
   public char[] getRecsReadDd600() throws CFException{
     if (isRecsReadDd600Modified()) { 
        recsReadDd600 = refreshRecsReadDd600();
     }
   		return recsReadDd600;
   }

  
	/**
	*  set variable recsReadDd600
	*  Corresponding COBOL Variable is 600-RECS-READ-DD
	*  @param value
	**/
   public void setRecsReadDd600(char[] value) {
      recsReadDd600 = checkRecsReadDd600Constraints(value);
      serializeRecsReadDd600(recsReadDd600);
   } 

     /**
	 * 	Update RecsReadDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecsReadDd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecsReadDd600,recsReadDd600.length);
   	
   }
   
   public void setRecsReadDd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecsReadDd600,recsReadDd600.length);
   	
   }
   
     /**
	 * 	Update RecsReadDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecsReadDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsReadDd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecsReadDd600 with another Field
	 *	@param value
	 */
   public void setRecsReadDd600(Field source) {
       replace(source,0,source.length(),beginRecsReadDd600,RECS_READ_DD_600_LEN);
   	
   }  
   
     /**
	 * 	Update RecsReadDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecsReadDd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecsReadDd600,RECS_READ_DD_600_LEN);
   	
   }
   
     /**
	 * 	Update RecsReadDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecsReadDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsReadDd600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recsReadCount600
	 *	@return recsReadCount600
	 */
   public char[] getRecsReadCount600() throws CFException{
     if (isRecsReadCount600Modified()) { 
        recsReadCount600 = refreshRecsReadCount600();
     }
   		return recsReadCount600;
   }

  
	/**
	*  set variable recsReadCount600
	*  Corresponding COBOL Variable is 600-RECS-READ-COUNT
	*  @param value
	**/
   public void setRecsReadCount600(char[] value) {
      recsReadCount600 = checkRecsReadCount600Constraints(value);
      serializeRecsReadCount600(recsReadCount600);
   } 

     /**
	 * 	Update RecsReadCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecsReadCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecsReadCount600,recsReadCount600.length);
   	
   }
   
   public void setRecsReadCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecsReadCount600,recsReadCount600.length);
   	
   }
   
     /**
	 * 	Update RecsReadCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecsReadCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsReadCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecsReadCount600 with another Field
	 *	@param value
	 */
   public void setRecsReadCount600(Field source) {
       replace(source,0,source.length(),beginRecsReadCount600,RECS_READ_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update RecsReadCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecsReadCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecsReadCount600,RECS_READ_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update RecsReadCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecsReadCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecsReadCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotalRecsReadMsg600FieldLength() {
			return TOTAL_RECS_READ_MSG_600_LENGTH;
		}

}
  
