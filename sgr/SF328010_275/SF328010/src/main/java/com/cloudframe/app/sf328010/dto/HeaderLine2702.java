package com.cloudframe.app.sf328010.dto;

/**
*  The class HeaderLine2702 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HeaderLine2702 extends HeaderLine2702Serialized {
   






								private char[] pageNum702 = Field.fillLowValue(11);

	
	/**
	* Constructor for HeaderLine2702
	**/
    public HeaderLine2702() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SERVER ID:ALL").toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 13
             ,23
             );
       replaceValue( // serialize and save the value
             (" ASA SERVICE ACTIVITY SUMMARY REPORT ").toCharArray()
             , getStartOffset() + 36
             ,37
             );
       replaceValue( // serialize and save the value
             fillSpace(34)
             , getStartOffset() + 73
             ,34
             );
       replaceValue( // serialize and save the value
             ("PAGE     :").toCharArray()
             , getStartOffset() + 107
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 128
             ,1
             );
    }


 

	/**
	 *	Returns the value of pageNum702
	 *	@return pageNum702
	 */
   public char[] getPageNum702() throws CFException{
     if (isPageNum702Modified()) { 
        pageNum702 = refreshPageNum702();
     }
   		return pageNum702;
   }

  
	/**
	*  set variable pageNum702
	*  Corresponding COBOL Variable is 702-PAGE-NUM
	*  @param value
	**/
   public void setPageNum702(char[] value) {
      pageNum702 = checkPageNum702Constraints(value);
      serializePageNum702(pageNum702);
   } 

     /**
	 * 	Update PageNum702 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageNum702(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPageNum702,pageNum702.length);
   	
   }
   
   public void setPageNum702(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPageNum702,pageNum702.length);
   	
   }
   
     /**
	 * 	Update PageNum702 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageNum702(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPageNum702+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PageNum702 with another Field
	 *	@param value
	 */
   public void setPageNum702(Field source) {
       replace(source,0,source.length(),beginPageNum702,PAGE_NUM_702_LEN);
   	
   }  
   
     /**
	 * 	Update PageNum702 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageNum702(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPageNum702,PAGE_NUM_702_LEN);
   	
   }
   
     /**
	 * 	Update PageNum702 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageNum702(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPageNum702+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeaderLine2702FieldLength() {
			return HEADER_LINE_2702_LENGTH;
		}

}
  
