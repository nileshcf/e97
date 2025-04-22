package com.cloudframe.app.search0.dto;

/**
*  The class SummarySubldgEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SummarySubldgEntries extends SummarySubldgEntriesSerialized { 
   

								private int summaryFinEvntNo;

								private int summaryFinCat;

						private char[] summaryFinMktId = Field.fillLowValue(3);
	
	/**
	* Constructor for SummarySubldgEntries
	**/
    public SummarySubldgEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SummarySubldgEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SummarySubldgEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of summaryFinEvntNo
	 *	@return summaryFinEvntNo
	 */
	public int getSummaryFinEvntNo() throws CFException {
        if (isSummaryFinEvntNoModified()) { 
           summaryFinEvntNo = refreshSummaryFinEvntNo();
        }
   		return summaryFinEvntNo;
	}
	
	/**
	 * 	Update SummaryFinEvntNo with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-FIN-EVNT-NO
	 *	@param number
	 */
	public void setSummaryFinEvntNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    summaryFinEvntNo = checkSummaryFinEvntNoMaxLimit(number); 
		serializeSummaryFinEvntNo(summaryFinEvntNo);
	}


	public void setSummaryFinEvntNo(long number) {
	    number = checkSummaryFinEvntNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummaryFinEvntNo((int)number);
	}
	
	/**
	 *	Returns the value of summaryFinCat
	 *	@return summaryFinCat
	 */
	public int getSummaryFinCat() throws CFException {
        if (isSummaryFinCatModified()) { 
           summaryFinCat = refreshSummaryFinCat();
        }
   		return summaryFinCat;
	}
	
	/**
	 * 	Update SummaryFinCat with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-FIN-CAT
	 *	@param number
	 */
	public void setSummaryFinCat(int number) {
	     // Truncate if the number is beyond +/- Max range
	    summaryFinCat = checkSummaryFinCatMaxLimit(number); 
		serializeSummaryFinCat(summaryFinCat);
	}


	public void setSummaryFinCat(long number) {
	    number = checkSummaryFinCatMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummaryFinCat((int)number);
	}
	
	/**
	 *	Returns the value of summaryFinMktId
	 *	@return summaryFinMktId
	 */
   public char[] getSummaryFinMktId() throws CFException{
     if (isSummaryFinMktIdModified()) { 
        summaryFinMktId = refreshSummaryFinMktId();
     }
   		return summaryFinMktId;
   }

  
	/**
	*  set variable summaryFinMktId
	*  Corresponding COBOL Variable is WS-SUMMARY-FIN-MKT-ID
	*  @param value
	**/
   public void setSummaryFinMktId(char[] value) {
      summaryFinMktId = checkSummaryFinMktIdConstraints(value);
      serializeSummaryFinMktId(summaryFinMktId);
   } 

     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryFinMktId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSummaryFinMktId,summaryFinMktId.length);
   	
   }
   
   public void setSummaryFinMktId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryFinMktId,summaryFinMktId.length);
   	
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryFinMktId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SummaryFinMktId with another Field
	 *	@param value
	 */
   public void setSummaryFinMktId(Field source) {
       replace(source,0,source.length(),beginSummaryFinMktId,SUMMARY_FIN_MKT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryFinMktId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSummaryFinMktId,SUMMARY_FIN_MKT_ID_LEN);
   	
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryFinMktId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSummarySubldgEntriesFieldLength() {
			return SUMMARY_SUBLDG_ENTRIES_LENGTH;
		}

}
  
