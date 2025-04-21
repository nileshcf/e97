package com.cloudframe.app.edjaddrs.dto.serialize;

/**
*  The class GenericTotalSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class GenericTotalSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GenericTotalSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GENERIC_TOTAL_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXy;
            protected  int beginNumericTotal;
            protected  int beginSnumericTotal;
            protected  int beginCompTotal;
            protected  int beginScompTotal;
            protected  int beginComp3Total;
            protected  int beginScomp3Total;
	
	/**
	* Constructor for GenericTotalSerialized
	**/
    public GenericTotalSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GenericTotalSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GENERIC_TOTAL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXy = getStartOffset() + 0;	// set offset for serialization
  
             beginNumericTotal = getStartOffset() + 0;	// set offset for serialization
  
             beginSnumericTotal = getStartOffset() + 0;	// set offset for serialization
  
             beginCompTotal = getStartOffset() + 0;	// set offset for serialization
  
             beginScompTotal = getStartOffset() + 0;	// set offset for serialization
  
             beginComp3Total = getStartOffset() + 0;	// set offset for serialization
  
             beginScomp3Total = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXyCounter = -1;
     public boolean isXyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXyCounter != sharedCounter;
         localXyCounter = sharedCounter; return hasModified;
     }
	protected static final int XY_LEN = 20;
	/**
	 * 	serialize this Xy
	 */
   protected void serializeXy(char[] xy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xy,0,getStringValue(),beginXy,XY_LEN);
       localXyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXyConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshXy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXy() {	 
   		return (substring(getStringValue(),beginXy,beginXy + XY_LEN));
   	}
        int localNumericTotalCounter = -1;
        public boolean isNumericTotalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localNumericTotalCounter != sharedCounter;
           localNumericTotalCounter = sharedCounter; return hasModified; 
        }
	    public boolean numericTotalIsNumeric() {
	      return decimalIsNumeric(beginNumericTotal,NUMERIC_TOTAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int NUMERIC_TOTAL_LEN = 10;
  	/**
	 * 	serializeNumericTotal
	 */
	protected void serializeNumericTotal(long numericTotal) {
		   putDecimal(beginNumericTotal,numericTotal,NUMERIC_TOTAL_LEN,false);
   }
   

   protected long checkNumericTotalMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshNumericTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNumericTotal() throws CFException {	
   	try { 
		 return (getLongDecimal(beginNumericTotal,NUMERIC_TOTAL_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("numericTotal", beginNumericTotal,NUMERIC_TOTAL_LEN);
     }
   	}
        int localSnumericTotalCounter = -1;
        public boolean isSnumericTotalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSnumericTotalCounter != sharedCounter;
           localSnumericTotalCounter = sharedCounter; return hasModified; 
        }
	    public boolean snumericTotalIsNumeric() {
	      return decimalIsNumeric(beginSnumericTotal,SNUMERIC_TOTAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SNUMERIC_TOTAL_LEN = 10;
  	/**
	 * 	serializeSnumericTotal
	 */
	protected void serializeSnumericTotal(long snumericTotal) {
		   putDecimal(beginSnumericTotal,snumericTotal,SNUMERIC_TOTAL_LEN,true);
   }
   

   protected long checkSnumericTotalMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSnumericTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSnumericTotal() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSnumericTotal,SNUMERIC_TOTAL_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("snumericTotal", beginSnumericTotal,SNUMERIC_TOTAL_LEN);
     }
   	}
         int localCompTotalCounter = -1;
         public boolean isCompTotalModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCompTotalCounter != sharedCounter;
            localCompTotalCounter = sharedCounter; return hasModified; 
         }
   protected static final int COMP_TOTAL_LEN = 8;
  	/**
	 * serializeCompTotal
	 */
	protected void serializeCompTotal(long compTotal) {
           replaceValue( //  save the value as string
                   getBinaryString( compTotal,COMP_TOTAL_LEN)
                  ,beginCompTotal
                  ,COMP_TOTAL_LEN
                 );
            localCompTotalCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkCompTotalMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshCompTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCompTotal() {	 
			return (getLong(beginCompTotal));
   	}
         int localScompTotalCounter = -1;
         public boolean isScompTotalModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localScompTotalCounter != sharedCounter;
            localScompTotalCounter = sharedCounter; return hasModified; 
         }
   protected static final int SCOMP_TOTAL_LEN = 8;
  	/**
	 * serializeScompTotal
	 */
	protected void serializeScompTotal(long scompTotal) {
           replaceValue( //  save the value as string
                   getBinaryString( scompTotal,SCOMP_TOTAL_LEN)
                  ,beginScompTotal
                  ,SCOMP_TOTAL_LEN
                 );
            localScompTotalCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkScompTotalMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshScompTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshScompTotal() {	 
			return (getLong(beginScompTotal));
   	}
        int localComp3TotalCounter = -1;
        public boolean isComp3TotalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localComp3TotalCounter != sharedCounter;
           localComp3TotalCounter = sharedCounter; return hasModified; 
        }
	    public boolean comp3TotalIsNumeric() {
	      return decimalIsNumeric(beginComp3Total,COMP_3_TOTAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COMP_3_TOTAL_LEN = 10;
  	/**
	 * 	serializeComp3Total
	 */
	protected void serializeComp3Total(long comp3Total) {
		   putDecimal(beginComp3Total,comp3Total,COMP_3_TOTAL_LEN,false);
   }
   

   protected long checkComp3TotalMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshComp3Total is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshComp3Total() throws CFException {	
   	try { 
		 return (getLongDecimal(beginComp3Total,COMP_3_TOTAL_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("comp3Total", beginComp3Total,COMP_3_TOTAL_LEN);
     }
   	}
        int localScomp3TotalCounter = -1;
        public boolean isScomp3TotalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localScomp3TotalCounter != sharedCounter;
           localScomp3TotalCounter = sharedCounter; return hasModified; 
        }
	    public boolean scomp3TotalIsNumeric() {
	      return decimalIsNumeric(beginScomp3Total,SCOMP_3_TOTAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SCOMP_3_TOTAL_LEN = 10;
  	/**
	 * 	serializeScomp3Total
	 */
	protected void serializeScomp3Total(long scomp3Total) {
		   putDecimal(beginScomp3Total,scomp3Total,SCOMP_3_TOTAL_LEN,true);
   }
   

   protected long checkScomp3TotalMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshScomp3Total is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshScomp3Total() throws CFException {	
   	try { 
		 return (getLongDecimal(beginScomp3Total,SCOMP_3_TOTAL_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("scomp3Total", beginScomp3Total,SCOMP_3_TOTAL_LEN);
     }
   	}




}
  
