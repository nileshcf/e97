package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcMwhSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcMwhSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcMwhSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_MWH_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcMwhBbl;
            protected  int beginWcMwhKb;
            protected  int beginWcMwhLit;
            protected  int beginWcMwhM3;
            protected  int beginWcMwhUsg;
            protected  int beginWcMwhUkg;
            protected  int beginWcMwhMmb;
            protected  int beginWcMwhGbt;
            protected  int beginWcMwhThm;
            protected  int beginWcMwhMwh;
            protected  int beginWcMwhGj;
            protected  int beginWcMwhDay;
	
	/**
	* Constructor for WcMwhSerialized
	**/
    public WcMwhSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcMwhSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcMwhSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcMwhSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,972); // serialize this field at offset 972 by default 
    }
    
	/**
	* sets parent for this WcMwhSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 972 by default
    }    
	/**
	* initializes the field in WcMwhSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_MWH_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcMwhBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcMwhKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcMwhLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcMwhM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcMwhUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcMwhUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcMwhMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcMwhGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcMwhThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcMwhMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcMwhGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcMwhDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcMwhBblCounter = -1;
        public boolean isWcMwhBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhBblCounter != sharedCounter;
           localWcMwhBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhBblIsNumeric() {
	      return decimalIsNumeric(beginWcMwhBbl,WC_MWH_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhBblString() {
            return getPackedString(beginWcMwhBbl,WC_MWH_BBL_LEN);
         }
   protected static final int WC_MWH_BBL_LEN = 9;
   protected static final int WC_MWH_BBL_SCALE = 4;
  	/**
	 * 	serializeWcMwhBbl
	 */
	protected void serializeWcMwhBbl(BigDecimal wcMwhBbl) {
		   putDecimal(beginWcMwhBbl,wcMwhBbl,WC_MWH_BBL_LEN,WC_MWH_BBL_SCALE,true);
		 localWcMwhBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhBbl,WC_MWH_BBL_LEN,WC_MWH_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhBbl", beginWcMwhBbl,WC_MWH_BBL_LEN);
     }
   	}
        int localWcMwhKbCounter = -1;
        public boolean isWcMwhKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhKbCounter != sharedCounter;
           localWcMwhKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhKbIsNumeric() {
	      return decimalIsNumeric(beginWcMwhKb,WC_MWH_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhKbString() {
            return getPackedString(beginWcMwhKb,WC_MWH_KB_LEN);
         }
   protected static final int WC_MWH_KB_LEN = 9;
   protected static final int WC_MWH_KB_SCALE = 4;
  	/**
	 * 	serializeWcMwhKb
	 */
	protected void serializeWcMwhKb(BigDecimal wcMwhKb) {
		   putDecimal(beginWcMwhKb,wcMwhKb,WC_MWH_KB_LEN,WC_MWH_KB_SCALE,true);
		 localWcMwhKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhKb,WC_MWH_KB_LEN,WC_MWH_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhKb", beginWcMwhKb,WC_MWH_KB_LEN);
     }
   	}
        int localWcMwhLitCounter = -1;
        public boolean isWcMwhLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhLitCounter != sharedCounter;
           localWcMwhLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhLitIsNumeric() {
	      return decimalIsNumeric(beginWcMwhLit,WC_MWH_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhLitString() {
            return getPackedString(beginWcMwhLit,WC_MWH_LIT_LEN);
         }
   protected static final int WC_MWH_LIT_LEN = 9;
   protected static final int WC_MWH_LIT_SCALE = 4;
  	/**
	 * 	serializeWcMwhLit
	 */
	protected void serializeWcMwhLit(BigDecimal wcMwhLit) {
		   putDecimal(beginWcMwhLit,wcMwhLit,WC_MWH_LIT_LEN,WC_MWH_LIT_SCALE,true);
		 localWcMwhLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhLit,WC_MWH_LIT_LEN,WC_MWH_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhLit", beginWcMwhLit,WC_MWH_LIT_LEN);
     }
   	}
        int localWcMwhM3Counter = -1;
        public boolean isWcMwhM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhM3Counter != sharedCounter;
           localWcMwhM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhM3IsNumeric() {
	      return decimalIsNumeric(beginWcMwhM3,WC_MWH_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhM3String() {
            return getPackedString(beginWcMwhM3,WC_MWH_M_3_LEN);
         }
   protected static final int WC_MWH_M_3_LEN = 9;
   protected static final int WC_MWH_M_3_SCALE = 4;
  	/**
	 * 	serializeWcMwhM3
	 */
	protected void serializeWcMwhM3(BigDecimal wcMwhM3) {
		   putDecimal(beginWcMwhM3,wcMwhM3,WC_MWH_M_3_LEN,WC_MWH_M_3_SCALE,true);
		 localWcMwhM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhM3,WC_MWH_M_3_LEN,WC_MWH_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhM3", beginWcMwhM3,WC_MWH_M_3_LEN);
     }
   	}
        int localWcMwhUsgCounter = -1;
        public boolean isWcMwhUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhUsgCounter != sharedCounter;
           localWcMwhUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhUsgIsNumeric() {
	      return decimalIsNumeric(beginWcMwhUsg,WC_MWH_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhUsgString() {
            return getPackedString(beginWcMwhUsg,WC_MWH_USG_LEN);
         }
   protected static final int WC_MWH_USG_LEN = 9;
   protected static final int WC_MWH_USG_SCALE = 4;
  	/**
	 * 	serializeWcMwhUsg
	 */
	protected void serializeWcMwhUsg(BigDecimal wcMwhUsg) {
		   putDecimal(beginWcMwhUsg,wcMwhUsg,WC_MWH_USG_LEN,WC_MWH_USG_SCALE,true);
		 localWcMwhUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhUsg,WC_MWH_USG_LEN,WC_MWH_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhUsg", beginWcMwhUsg,WC_MWH_USG_LEN);
     }
   	}
        int localWcMwhUkgCounter = -1;
        public boolean isWcMwhUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhUkgCounter != sharedCounter;
           localWcMwhUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhUkgIsNumeric() {
	      return decimalIsNumeric(beginWcMwhUkg,WC_MWH_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhUkgString() {
            return getPackedString(beginWcMwhUkg,WC_MWH_UKG_LEN);
         }
   protected static final int WC_MWH_UKG_LEN = 9;
   protected static final int WC_MWH_UKG_SCALE = 4;
  	/**
	 * 	serializeWcMwhUkg
	 */
	protected void serializeWcMwhUkg(BigDecimal wcMwhUkg) {
		   putDecimal(beginWcMwhUkg,wcMwhUkg,WC_MWH_UKG_LEN,WC_MWH_UKG_SCALE,true);
		 localWcMwhUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhUkg,WC_MWH_UKG_LEN,WC_MWH_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhUkg", beginWcMwhUkg,WC_MWH_UKG_LEN);
     }
   	}
        int localWcMwhMmbCounter = -1;
        public boolean isWcMwhMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhMmbCounter != sharedCounter;
           localWcMwhMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhMmbIsNumeric() {
	      return decimalIsNumeric(beginWcMwhMmb,WC_MWH_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhMmbString() {
            return getPackedString(beginWcMwhMmb,WC_MWH_MMB_LEN);
         }
   protected static final int WC_MWH_MMB_LEN = 9;
   protected static final int WC_MWH_MMB_SCALE = 4;
  	/**
	 * 	serializeWcMwhMmb
	 */
	protected void serializeWcMwhMmb(BigDecimal wcMwhMmb) {
		   putDecimal(beginWcMwhMmb,wcMwhMmb,WC_MWH_MMB_LEN,WC_MWH_MMB_SCALE,true);
		 localWcMwhMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhMmb,WC_MWH_MMB_LEN,WC_MWH_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhMmb", beginWcMwhMmb,WC_MWH_MMB_LEN);
     }
   	}
        int localWcMwhGbtCounter = -1;
        public boolean isWcMwhGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhGbtCounter != sharedCounter;
           localWcMwhGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhGbtIsNumeric() {
	      return decimalIsNumeric(beginWcMwhGbt,WC_MWH_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhGbtString() {
            return getPackedString(beginWcMwhGbt,WC_MWH_GBT_LEN);
         }
   protected static final int WC_MWH_GBT_LEN = 9;
   protected static final int WC_MWH_GBT_SCALE = 4;
  	/**
	 * 	serializeWcMwhGbt
	 */
	protected void serializeWcMwhGbt(BigDecimal wcMwhGbt) {
		   putDecimal(beginWcMwhGbt,wcMwhGbt,WC_MWH_GBT_LEN,WC_MWH_GBT_SCALE,true);
		 localWcMwhGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhGbt,WC_MWH_GBT_LEN,WC_MWH_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhGbt", beginWcMwhGbt,WC_MWH_GBT_LEN);
     }
   	}
        int localWcMwhThmCounter = -1;
        public boolean isWcMwhThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhThmCounter != sharedCounter;
           localWcMwhThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhThmIsNumeric() {
	      return decimalIsNumeric(beginWcMwhThm,WC_MWH_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhThmString() {
            return getPackedString(beginWcMwhThm,WC_MWH_THM_LEN);
         }
   protected static final int WC_MWH_THM_LEN = 9;
   protected static final int WC_MWH_THM_SCALE = 4;
  	/**
	 * 	serializeWcMwhThm
	 */
	protected void serializeWcMwhThm(BigDecimal wcMwhThm) {
		   putDecimal(beginWcMwhThm,wcMwhThm,WC_MWH_THM_LEN,WC_MWH_THM_SCALE,true);
		 localWcMwhThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhThm,WC_MWH_THM_LEN,WC_MWH_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhThm", beginWcMwhThm,WC_MWH_THM_LEN);
     }
   	}
        int localWcMwhMwhCounter = -1;
        public boolean isWcMwhMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhMwhCounter != sharedCounter;
           localWcMwhMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhMwhIsNumeric() {
	      return decimalIsNumeric(beginWcMwhMwh,WC_MWH_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhMwhString() {
            return getPackedString(beginWcMwhMwh,WC_MWH_MWH_LEN);
         }
   protected static final int WC_MWH_MWH_LEN = 9;
   protected static final int WC_MWH_MWH_SCALE = 4;
  	/**
	 * 	serializeWcMwhMwh
	 */
	protected void serializeWcMwhMwh(BigDecimal wcMwhMwh) {
		   putDecimal(beginWcMwhMwh,wcMwhMwh,WC_MWH_MWH_LEN,WC_MWH_MWH_SCALE,true);
		 localWcMwhMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhMwh,WC_MWH_MWH_LEN,WC_MWH_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhMwh", beginWcMwhMwh,WC_MWH_MWH_LEN);
     }
   	}
        int localWcMwhGjCounter = -1;
        public boolean isWcMwhGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhGjCounter != sharedCounter;
           localWcMwhGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhGjIsNumeric() {
	      return decimalIsNumeric(beginWcMwhGj,WC_MWH_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhGjString() {
            return getPackedString(beginWcMwhGj,WC_MWH_GJ_LEN);
         }
   protected static final int WC_MWH_GJ_LEN = 9;
   protected static final int WC_MWH_GJ_SCALE = 4;
  	/**
	 * 	serializeWcMwhGj
	 */
	protected void serializeWcMwhGj(BigDecimal wcMwhGj) {
		   putDecimal(beginWcMwhGj,wcMwhGj,WC_MWH_GJ_LEN,WC_MWH_GJ_SCALE,true);
		 localWcMwhGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhGj,WC_MWH_GJ_LEN,WC_MWH_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhGj", beginWcMwhGj,WC_MWH_GJ_LEN);
     }
   	}
        int localWcMwhDayCounter = -1;
        public boolean isWcMwhDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMwhDayCounter != sharedCounter;
           localWcMwhDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMwhDayIsNumeric() {
	      return decimalIsNumeric(beginWcMwhDay,WC_MWH_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMwhDayString() {
            return getPackedString(beginWcMwhDay,WC_MWH_DAY_LEN);
         }
   protected static final int WC_MWH_DAY_LEN = 9;
   protected static final int WC_MWH_DAY_SCALE = 4;
  	/**
	 * 	serializeWcMwhDay
	 */
	protected void serializeWcMwhDay(BigDecimal wcMwhDay) {
		   putDecimal(beginWcMwhDay,wcMwhDay,WC_MWH_DAY_LEN,WC_MWH_DAY_SCALE,true);
		 localWcMwhDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMwhDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMwhDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMwhDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMwhDay,WC_MWH_DAY_LEN,WC_MWH_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMwhDay", beginWcMwhDay,WC_MWH_DAY_LEN);
     }
   	}




}
  
