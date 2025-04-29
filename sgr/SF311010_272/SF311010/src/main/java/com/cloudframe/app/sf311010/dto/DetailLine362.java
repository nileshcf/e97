package com.cloudframe.app.sf311010.dto;

/**
*  The class DetailLine362 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailLine362 extends DetailLine362Serialized {
   

						private char[] detailReportId362 = new char[1];

						private char[] detailCarCon362 = new char[1];


						private char[] detailLogType362 = new char[27];

						private char[] detailLogClass362 = new char[1];


								private char[] detailRecordTotal362 = Field.fillLowValue(11);

	
	/**
	* Constructor for DetailLine362
	**/
    public DetailLine362() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDetailReportId362(fillSpace(1));
								setDetailCarCon362(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
								setDetailLogType362(fillSpace(27));
								setDetailLogClass362(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 38
             ,9
             );
       replaceValue( // serialize and save the value
             pad(70," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 58
             ,70
             );
    }


 

	/**
	 *	Returns the value of detailReportId362
	 *	@return detailReportId362
	 */
   public char[] getDetailReportId362() throws CFException{
     if (isDetailReportId362Modified()) { 
        detailReportId362 = refreshDetailReportId362();
     }
   		return detailReportId362;
   }

  
	/**
	*  set variable detailReportId362
	*  Corresponding COBOL Variable is 362-DETAIL-REPORT-ID
	*  @param value
	**/
   public void setDetailReportId362(char[] value) {
      detailReportId362 = checkDetailReportId362Constraints(value);
      serializeDetailReportId362(detailReportId362);
   } 

     /**
	 * 	Update DetailReportId362 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetailReportId362(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetailReportId362,detailReportId362.length);
   	
   }
   
   public void setDetailReportId362(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetailReportId362,detailReportId362.length);
   	
   }
   
     /**
	 * 	Update DetailReportId362 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetailReportId362(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailReportId362+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetailReportId362 with another Field
	 *	@param value
	 */
   public void setDetailReportId362(Field source) {
       replace(source,0,source.length(),beginDetailReportId362,DETAIL_REPORT_ID_362_LEN);
   	
   }  
   
     /**
	 * 	Update DetailReportId362 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetailReportId362(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetailReportId362,DETAIL_REPORT_ID_362_LEN);
   	
   }
   
     /**
	 * 	Update DetailReportId362 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetailReportId362(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailReportId362+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detailCarCon362
	 *	@return detailCarCon362
	 */
   public char[] getDetailCarCon362() throws CFException{
     if (isDetailCarCon362Modified()) { 
        detailCarCon362 = refreshDetailCarCon362();
     }
   		return detailCarCon362;
   }

  
	/**
	*  set variable detailCarCon362
	*  Corresponding COBOL Variable is 362-DETAIL-CAR-CON
	*  @param value
	**/
   public void setDetailCarCon362(char[] value) {
      detailCarCon362 = checkDetailCarCon362Constraints(value);
      serializeDetailCarCon362(detailCarCon362);
   } 

     /**
	 * 	Update DetailCarCon362 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetailCarCon362(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetailCarCon362,detailCarCon362.length);
   	
   }
   
   public void setDetailCarCon362(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetailCarCon362,detailCarCon362.length);
   	
   }
   
     /**
	 * 	Update DetailCarCon362 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetailCarCon362(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailCarCon362+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetailCarCon362 with another Field
	 *	@param value
	 */
   public void setDetailCarCon362(Field source) {
       replace(source,0,source.length(),beginDetailCarCon362,DETAIL_CAR_CON_362_LEN);
   	
   }  
   
     /**
	 * 	Update DetailCarCon362 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetailCarCon362(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetailCarCon362,DETAIL_CAR_CON_362_LEN);
   	
   }
   
     /**
	 * 	Update DetailCarCon362 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetailCarCon362(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailCarCon362+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detailLogType362
	 *	@return detailLogType362
	 */
   public char[] getDetailLogType362() throws CFException{
     if (isDetailLogType362Modified()) { 
        detailLogType362 = refreshDetailLogType362();
     }
   		return detailLogType362;
   }

  
	/**
	*  set variable detailLogType362
	*  Corresponding COBOL Variable is 362-DETAIL-LOG-TYPE
	*  @param value
	**/
   public void setDetailLogType362(char[] value) {
      detailLogType362 = checkDetailLogType362Constraints(value);
      serializeDetailLogType362(detailLogType362);
   } 

     /**
	 * 	Update DetailLogType362 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetailLogType362(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetailLogType362,detailLogType362.length);
   	
   }
   
   public void setDetailLogType362(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetailLogType362,detailLogType362.length);
   	
   }
   
     /**
	 * 	Update DetailLogType362 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetailLogType362(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailLogType362+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetailLogType362 with another Field
	 *	@param value
	 */
   public void setDetailLogType362(Field source) {
       replace(source,0,source.length(),beginDetailLogType362,DETAIL_LOG_TYPE_362_LEN);
   	
   }  
   
     /**
	 * 	Update DetailLogType362 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetailLogType362(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetailLogType362,DETAIL_LOG_TYPE_362_LEN);
   	
   }
   
     /**
	 * 	Update DetailLogType362 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetailLogType362(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailLogType362+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detailLogClass362
	 *	@return detailLogClass362
	 */
   public char[] getDetailLogClass362() throws CFException{
     if (isDetailLogClass362Modified()) { 
        detailLogClass362 = refreshDetailLogClass362();
     }
   		return detailLogClass362;
   }

  
	/**
	*  set variable detailLogClass362
	*  Corresponding COBOL Variable is 362-DETAIL-LOG-CLASS
	*  @param value
	**/
   public void setDetailLogClass362(char[] value) {
      detailLogClass362 = checkDetailLogClass362Constraints(value);
      serializeDetailLogClass362(detailLogClass362);
   } 

     /**
	 * 	Update DetailLogClass362 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetailLogClass362(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetailLogClass362,detailLogClass362.length);
   	
   }
   
   public void setDetailLogClass362(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetailLogClass362,detailLogClass362.length);
   	
   }
   
     /**
	 * 	Update DetailLogClass362 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetailLogClass362(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailLogClass362+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetailLogClass362 with another Field
	 *	@param value
	 */
   public void setDetailLogClass362(Field source) {
       replace(source,0,source.length(),beginDetailLogClass362,DETAIL_LOG_CLASS_362_LEN);
   	
   }  
   
     /**
	 * 	Update DetailLogClass362 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetailLogClass362(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetailLogClass362,DETAIL_LOG_CLASS_362_LEN);
   	
   }
   
     /**
	 * 	Update DetailLogClass362 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetailLogClass362(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailLogClass362+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detailRecordTotal362
	 *	@return detailRecordTotal362
	 */
   public char[] getDetailRecordTotal362() throws CFException{
     if (isDetailRecordTotal362Modified()) { 
        detailRecordTotal362 = refreshDetailRecordTotal362();
     }
   		return detailRecordTotal362;
   }

  
	/**
	*  set variable detailRecordTotal362
	*  Corresponding COBOL Variable is 362-DETAIL-RECORD-TOTAL
	*  @param value
	**/
   public void setDetailRecordTotal362(char[] value) {
      detailRecordTotal362 = checkDetailRecordTotal362Constraints(value);
      serializeDetailRecordTotal362(detailRecordTotal362);
   } 

     /**
	 * 	Update DetailRecordTotal362 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetailRecordTotal362(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetailRecordTotal362,detailRecordTotal362.length);
   	
   }
   
   public void setDetailRecordTotal362(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetailRecordTotal362,detailRecordTotal362.length);
   	
   }
   
     /**
	 * 	Update DetailRecordTotal362 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetailRecordTotal362(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailRecordTotal362+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetailRecordTotal362 with another Field
	 *	@param value
	 */
   public void setDetailRecordTotal362(Field source) {
       replace(source,0,source.length(),beginDetailRecordTotal362,DETAIL_RECORD_TOTAL_362_LEN);
   	
   }  
   
     /**
	 * 	Update DetailRecordTotal362 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetailRecordTotal362(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetailRecordTotal362,DETAIL_RECORD_TOTAL_362_LEN);
   	
   }
   
     /**
	 * 	Update DetailRecordTotal362 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetailRecordTotal362(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetailRecordTotal362+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetailLine362FieldLength() {
			return DETAIL_LINE_362_LENGTH;
		}

}
  
