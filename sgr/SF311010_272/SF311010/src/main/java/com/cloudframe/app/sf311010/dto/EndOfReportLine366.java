package com.cloudframe.app.sf311010.dto;

/**
*  The class EndOfReportLine366 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EndOfReportLine366 extends EndOfReportLine366Serialized {
   

						private char[] endofrptReportId366 = new char[1];

						private char[] endofrptCarCon366 = new char[1];




	
	/**
	* Constructor for EndOfReportLine366
	**/
    public EndOfReportLine366() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEndofrptReportId366(fillSpace(1));
								setEndofrptCarCon366(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
       replaceValue( // serialize and save the value
             ("* * * * *   E N D   O F   R E P O R T   ").toCharArray()
             , getStartOffset() + 10
             ,40
             );
       replaceValue( // serialize and save the value
             ("S F 3 1 1 0 1 0 - A A   * * * * *       ").toCharArray()
             , getStartOffset() + 50
             ,40
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 90
             ,40
             );
    }


 

	/**
	 *	Returns the value of endofrptReportId366
	 *	@return endofrptReportId366
	 */
   public char[] getEndofrptReportId366() throws CFException{
     if (isEndofrptReportId366Modified()) { 
        endofrptReportId366 = refreshEndofrptReportId366();
     }
   		return endofrptReportId366;
   }

  
	/**
	*  set variable endofrptReportId366
	*  Corresponding COBOL Variable is 366-ENDOFRPT-REPORT-ID
	*  @param value
	**/
   public void setEndofrptReportId366(char[] value) {
      endofrptReportId366 = checkEndofrptReportId366Constraints(value);
      serializeEndofrptReportId366(endofrptReportId366);
   } 

     /**
	 * 	Update EndofrptReportId366 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndofrptReportId366(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndofrptReportId366,endofrptReportId366.length);
   	
   }
   
   public void setEndofrptReportId366(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndofrptReportId366,endofrptReportId366.length);
   	
   }
   
     /**
	 * 	Update EndofrptReportId366 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndofrptReportId366(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndofrptReportId366+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndofrptReportId366 with another Field
	 *	@param value
	 */
   public void setEndofrptReportId366(Field source) {
       replace(source,0,source.length(),beginEndofrptReportId366,ENDOFRPT_REPORT_ID_366_LEN);
   	
   }  
   
     /**
	 * 	Update EndofrptReportId366 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndofrptReportId366(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndofrptReportId366,ENDOFRPT_REPORT_ID_366_LEN);
   	
   }
   
     /**
	 * 	Update EndofrptReportId366 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndofrptReportId366(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndofrptReportId366+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of endofrptCarCon366
	 *	@return endofrptCarCon366
	 */
   public char[] getEndofrptCarCon366() throws CFException{
     if (isEndofrptCarCon366Modified()) { 
        endofrptCarCon366 = refreshEndofrptCarCon366();
     }
   		return endofrptCarCon366;
   }

  
	/**
	*  set variable endofrptCarCon366
	*  Corresponding COBOL Variable is 366-ENDOFRPT-CAR-CON
	*  @param value
	**/
   public void setEndofrptCarCon366(char[] value) {
      endofrptCarCon366 = checkEndofrptCarCon366Constraints(value);
      serializeEndofrptCarCon366(endofrptCarCon366);
   } 

     /**
	 * 	Update EndofrptCarCon366 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndofrptCarCon366(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndofrptCarCon366,endofrptCarCon366.length);
   	
   }
   
   public void setEndofrptCarCon366(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndofrptCarCon366,endofrptCarCon366.length);
   	
   }
   
     /**
	 * 	Update EndofrptCarCon366 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndofrptCarCon366(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndofrptCarCon366+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndofrptCarCon366 with another Field
	 *	@param value
	 */
   public void setEndofrptCarCon366(Field source) {
       replace(source,0,source.length(),beginEndofrptCarCon366,ENDOFRPT_CAR_CON_366_LEN);
   	
   }  
   
     /**
	 * 	Update EndofrptCarCon366 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndofrptCarCon366(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndofrptCarCon366,ENDOFRPT_CAR_CON_366_LEN);
   	
   }
   
     /**
	 * 	Update EndofrptCarCon366 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndofrptCarCon366(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndofrptCarCon366+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEndOfReportLine366FieldLength() {
			return END_OF_REPORT_LINE_366_LENGTH;
		}

}
  
