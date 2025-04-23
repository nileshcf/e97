package com.cloudframe.app.mcissues.dto;

/**
*  The class Report1HeadingLine11701 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Report1HeadingLine11701 extends Report1HeadingLine11701Serialized { 
   


								private char[] sourceMessageNo701 = Field.fillLowValue(9);

	
	/**
	* Constructor for Report1HeadingLine11701
	**/
    public Report1HeadingLine11701() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Report1HeadingLine11701. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Report1HeadingLine11701(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("SOURCE MESSAGE #:   ").toCharArray()
             , getStartOffset() + 0
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 29
             ,5
             );
    } 

	/**
	 *	Returns the value of sourceMessageNo701
	 *	@return sourceMessageNo701
	 */
   public char[] getSourceMessageNo701() throws CFException{
     if (isSourceMessageNo701Modified()) { 
        sourceMessageNo701 = refreshSourceMessageNo701();
     }
   		return sourceMessageNo701;
   }

  
	/**
	*  set variable sourceMessageNo701
	*  Corresponding COBOL Variable is 701-SOURCE-MESSAGE-NO
	*  @param value
	**/
   public void setSourceMessageNo701(char[] value) {
      sourceMessageNo701 = checkSourceMessageNo701Constraints(value);
      serializeSourceMessageNo701(sourceMessageNo701);
   } 

     /**
	 * 	Update SourceMessageNo701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSourceMessageNo701(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSourceMessageNo701,sourceMessageNo701.length);
   	
   }
   
   public void setSourceMessageNo701(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSourceMessageNo701,sourceMessageNo701.length);
   	
   }
   
     /**
	 * 	Update SourceMessageNo701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSourceMessageNo701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSourceMessageNo701+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SourceMessageNo701 with another Field
	 *	@param value
	 */
   public void setSourceMessageNo701(Field source) {
       replace(source,0,source.length(),beginSourceMessageNo701,SOURCE_MESSAGE_NO_701_LEN);
   	
   }  
   
     /**
	 * 	Update SourceMessageNo701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSourceMessageNo701(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSourceMessageNo701,SOURCE_MESSAGE_NO_701_LEN);
   	
   }
   
     /**
	 * 	Update SourceMessageNo701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSourceMessageNo701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSourceMessageNo701+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReport1HeadingLine11701FieldLength() {
			return REPORT_1_HEADING_LINE_11701_LENGTH;
		}

}
  
