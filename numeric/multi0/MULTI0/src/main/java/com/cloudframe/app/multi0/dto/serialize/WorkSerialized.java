package com.cloudframe.app.multi0.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWrkDb1dayFlt;
            protected  int beginWrkDb1dayFltDisp;
            protected  int beginAxisWpCoiAccum;
            protected  int beginAxisWpCoiRound;
            protected  int beginAxisWpCoiRoundDisp;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWrkDb1dayFlt = getStartOffset() + 0;	// set offset for serialization
  
             beginWrkDb1dayFltDisp = getStartOffset() + 5;	// set offset for serialization
  
             beginAxisWpCoiAccum = getStartOffset() + 16;	// set offset for serialization
  
             beginAxisWpCoiRound = getStartOffset() + 31;	// set offset for serialization
  
             beginAxisWpCoiRoundDisp = getStartOffset() + 40;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWrkDb1dayFltCounter = -1;
        public boolean isWrkDb1dayFltModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWrkDb1dayFltCounter != sharedCounter;
           localWrkDb1dayFltCounter = sharedCounter; return hasModified; 
        }
	    public boolean wrkDb1dayFltIsNumeric() {
	      return decimalIsNumeric(beginWrkDb1dayFlt,WRK_DB_1DAY_FLT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wrkDb1dayFltString() {
            return getPackedString(beginWrkDb1dayFlt,WRK_DB_1DAY_FLT_LEN);
         }
   protected static final int WRK_DB_1DAY_FLT_LEN = 5;
   protected static final int WRK_DB_1DAY_FLT_SCALE = 4;
  	/**
	 * 	serializeWrkDb1dayFlt
	 */
	protected void serializeWrkDb1dayFlt(BigDecimal wrkDb1dayFlt) {
		   putDecimal(beginWrkDb1dayFlt,wrkDb1dayFlt,WRK_DB_1DAY_FLT_LEN,WRK_DB_1DAY_FLT_SCALE,true);
		 localWrkDb1dayFltCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWrkDb1dayFltMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshWrkDb1dayFlt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWrkDb1dayFlt() throws CFException {	
   	try { 
		 return (getDecimal(beginWrkDb1dayFlt,WRK_DB_1DAY_FLT_LEN,WRK_DB_1DAY_FLT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wrkDb1dayFlt", beginWrkDb1dayFlt,WRK_DB_1DAY_FLT_LEN);
     }
   	}
     int localWrkDb1dayFltDispCounter = -1;
     public boolean isWrkDb1dayFltDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrkDb1dayFltDispCounter != sharedCounter;
         localWrkDb1dayFltDispCounter = sharedCounter; return hasModified;
     }
	protected static final int WRK_DB_1DAY_FLT_DISP_LEN = 11;
	/**
	 * 	serialize this WrkDb1dayFltDisp
	 */
   protected void serializeWrkDb1dayFltDisp(char[] wrkDb1dayFltDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wrkDb1dayFltDisp,0,getStringValue(),beginWrkDb1dayFltDisp,WRK_DB_1DAY_FLT_DISP_LEN);
       localWrkDb1dayFltDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWrkDb1dayFltDispConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshWrkDb1dayFltDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWrkDb1dayFltDisp() {	 
   		return (substring(getStringValue(),beginWrkDb1dayFltDisp,beginWrkDb1dayFltDisp + WRK_DB_1DAY_FLT_DISP_LEN));
   	}
     int localAxisWpCoiAccumCounter = -1;
     
     public boolean isAxisWpCoiAccumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAxisWpCoiAccumCounter != sharedCounter;
         localAxisWpCoiAccumCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public char[]  getAxisWpCoiAccumString() {
	    return getCharArray(beginAxisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean axisWpCoiAccumIsNumeric() {
		    return isNumeric(beginAxisWpCoiAccum
	                    ,beginAxisWpCoiAccum + AXIS_WP_COI_ACCUM_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AXIS_WP_COI_ACCUM_LEN = 15;
  protected  static final int AXIS_WP_COI_ACCUM_SCALE = 2;

   protected BigDecimal checkAxisWpCoiAccumMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeAxisWpCoiAccum
	 */
	protected void serializeAxisWpCoiAccum(BigDecimal axisWpCoiAccum) {
	       putNumber(beginAxisWpCoiAccum,axisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN,AXIS_WP_COI_ACCUM_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAxisWpCoiAccumCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAxisWpCoiAccum
	 */
   	protected  BigDecimal serializeAxisWpCoiAccum(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginAxisWpCoiAccum
		       ,15
		      );		 localAxisWpCoiAccumCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AXIS_WP_COI_ACCUM_LEN,AXIS_WP_COI_ACCUM_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("axisWpCoiAccum", beginAxisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN);
    	}
    }
    /**
	 *	refreshAxisWpCoiAccum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAxisWpCoiAccum() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAxisWpCoiAccum
			            ,AXIS_WP_COI_ACCUM_LEN
			            ,AXIS_WP_COI_ACCUM_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("axisWpCoiAccum", beginAxisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN);
    }
   	}
     int localAxisWpCoiRoundCounter = -1;
     public boolean isAxisWpCoiRoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAxisWpCoiRoundCounter != sharedCounter;
         localAxisWpCoiRoundCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundString() {
	     return getCharArray(beginAxisWpCoiRound,AXIS_WP_COI_ROUND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean axisWpCoiRoundIsNumeric() {
	    return isNumeric(beginAxisWpCoiRound
	                    ,beginAxisWpCoiRound + AXIS_WP_COI_ROUND_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AXIS_WP_COI_ROUND_LEN = 9;
  	/**
	 * serializeAxisWpCoiRound
	 */
	protected void serializeAxisWpCoiRound(int axisWpCoiRound) {
		 putNumber(beginAxisWpCoiRound,axisWpCoiRound,AXIS_WP_COI_ROUND_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAxisWpCoiRoundCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAxisWpCoiRound
	 */
   	protected  int serializeAxisWpCoiRound(char[] value) {
	    int  axisWpCoiRound;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    axisWpCoiRound = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginAxisWpCoiRound
		       ,9
		      );
		 localAxisWpCoiRoundCounter = shareString.getSerializedField().getModifiedCounter();
		return  axisWpCoiRound;
    }

   protected int checkAxisWpCoiRoundMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAxisWpCoiRound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAxisWpCoiRound() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAxisWpCoiRound
			                 ,AXIS_WP_COI_ROUND_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("axisWpCoiRound", beginAxisWpCoiRound,AXIS_WP_COI_ROUND_LEN);
    }
   	}
     int localAxisWpCoiRoundDispCounter = -1;
     public boolean isAxisWpCoiRoundDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAxisWpCoiRoundDispCounter != sharedCounter;
         localAxisWpCoiRoundDispCounter = sharedCounter; return hasModified;
     }
	protected static final int AXIS_WP_COI_ROUND_DISP_LEN = 10;
	/**
	 * 	serialize this AxisWpCoiRoundDisp
	 */
   protected void serializeAxisWpCoiRoundDisp(char[] axisWpCoiRoundDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(axisWpCoiRoundDisp,0,getStringValue(),beginAxisWpCoiRoundDisp,AXIS_WP_COI_ROUND_DISP_LEN);
       localAxisWpCoiRoundDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAxisWpCoiRoundDispConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshAxisWpCoiRoundDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAxisWpCoiRoundDisp() {	 
   		return (substring(getStringValue(),beginAxisWpCoiRoundDisp,beginAxisWpCoiRoundDisp + AXIS_WP_COI_ROUND_DISP_LEN));
   	}




}
  
