package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcCubicMetresSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcCubicMetresSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcCubicMetresSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_CUBIC_METRES_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcM3Bbl;
            protected  int beginWcM3Kb;
            protected  int beginWcM3Lit;
            protected  int beginWcM3M3;
            protected  int beginWcM3Usg;
            protected  int beginWcM3Ukg;
            protected  int beginWcM3Mmb;
            protected  int beginWcM3Gbt;
            protected  int beginWcM3Thm;
            protected  int beginWcM3Mwh;
            protected  int beginWcM3Gj;
            protected  int beginWcM3Day;
	
	/**
	* Constructor for WcCubicMetresSerialized
	**/
    public WcCubicMetresSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcCubicMetresSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcCubicMetresSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcCubicMetresSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,324); // serialize this field at offset 324 by default 
    }
    
	/**
	* sets parent for this WcCubicMetresSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 324 by default
    }    
	/**
	* initializes the field in WcCubicMetresSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_CUBIC_METRES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcM3Bbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcM3Kb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcM3Lit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcM3M3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcM3Usg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcM3Ukg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcM3Mmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcM3Gbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcM3Thm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcM3Mwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcM3Gj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcM3Day = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcM3BblCounter = -1;
        public boolean isWcM3BblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3BblCounter != sharedCounter;
           localWcM3BblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3BblIsNumeric() {
	      return decimalIsNumeric(beginWcM3Bbl,WC_M_3_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3BblString() {
            return getPackedString(beginWcM3Bbl,WC_M_3_BBL_LEN);
         }
   protected static final int WC_M_3_BBL_LEN = 9;
   protected static final int WC_M_3_BBL_SCALE = 4;
  	/**
	 * 	serializeWcM3Bbl
	 */
	protected void serializeWcM3Bbl(BigDecimal wcM3Bbl) {
		   putDecimal(beginWcM3Bbl,wcM3Bbl,WC_M_3_BBL_LEN,WC_M_3_BBL_SCALE,true);
		 localWcM3BblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3BblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Bbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Bbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Bbl,WC_M_3_BBL_LEN,WC_M_3_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Bbl", beginWcM3Bbl,WC_M_3_BBL_LEN);
     }
   	}
        int localWcM3KbCounter = -1;
        public boolean isWcM3KbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3KbCounter != sharedCounter;
           localWcM3KbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3KbIsNumeric() {
	      return decimalIsNumeric(beginWcM3Kb,WC_M_3_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3KbString() {
            return getPackedString(beginWcM3Kb,WC_M_3_KB_LEN);
         }
   protected static final int WC_M_3_KB_LEN = 9;
   protected static final int WC_M_3_KB_SCALE = 4;
  	/**
	 * 	serializeWcM3Kb
	 */
	protected void serializeWcM3Kb(BigDecimal wcM3Kb) {
		   putDecimal(beginWcM3Kb,wcM3Kb,WC_M_3_KB_LEN,WC_M_3_KB_SCALE,true);
		 localWcM3KbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3KbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Kb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Kb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Kb,WC_M_3_KB_LEN,WC_M_3_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Kb", beginWcM3Kb,WC_M_3_KB_LEN);
     }
   	}
        int localWcM3LitCounter = -1;
        public boolean isWcM3LitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3LitCounter != sharedCounter;
           localWcM3LitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3LitIsNumeric() {
	      return decimalIsNumeric(beginWcM3Lit,WC_M_3_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3LitString() {
            return getPackedString(beginWcM3Lit,WC_M_3_LIT_LEN);
         }
   protected static final int WC_M_3_LIT_LEN = 9;
   protected static final int WC_M_3_LIT_SCALE = 4;
  	/**
	 * 	serializeWcM3Lit
	 */
	protected void serializeWcM3Lit(BigDecimal wcM3Lit) {
		   putDecimal(beginWcM3Lit,wcM3Lit,WC_M_3_LIT_LEN,WC_M_3_LIT_SCALE,true);
		 localWcM3LitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3LitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Lit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Lit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Lit,WC_M_3_LIT_LEN,WC_M_3_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Lit", beginWcM3Lit,WC_M_3_LIT_LEN);
     }
   	}
        int localWcM3M3Counter = -1;
        public boolean isWcM3M3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3M3Counter != sharedCounter;
           localWcM3M3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3M3IsNumeric() {
	      return decimalIsNumeric(beginWcM3M3,WC_M_3_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3M3String() {
            return getPackedString(beginWcM3M3,WC_M_3_M_3_LEN);
         }
   protected static final int WC_M_3_M_3_LEN = 9;
   protected static final int WC_M_3_M_3_SCALE = 4;
  	/**
	 * 	serializeWcM3M3
	 */
	protected void serializeWcM3M3(BigDecimal wcM3M3) {
		   putDecimal(beginWcM3M3,wcM3M3,WC_M_3_M_3_LEN,WC_M_3_M_3_SCALE,true);
		 localWcM3M3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3M3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3M3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3M3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3M3,WC_M_3_M_3_LEN,WC_M_3_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3M3", beginWcM3M3,WC_M_3_M_3_LEN);
     }
   	}
        int localWcM3UsgCounter = -1;
        public boolean isWcM3UsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3UsgCounter != sharedCounter;
           localWcM3UsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3UsgIsNumeric() {
	      return decimalIsNumeric(beginWcM3Usg,WC_M_3_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3UsgString() {
            return getPackedString(beginWcM3Usg,WC_M_3_USG_LEN);
         }
   protected static final int WC_M_3_USG_LEN = 9;
   protected static final int WC_M_3_USG_SCALE = 4;
  	/**
	 * 	serializeWcM3Usg
	 */
	protected void serializeWcM3Usg(BigDecimal wcM3Usg) {
		   putDecimal(beginWcM3Usg,wcM3Usg,WC_M_3_USG_LEN,WC_M_3_USG_SCALE,true);
		 localWcM3UsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3UsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Usg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Usg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Usg,WC_M_3_USG_LEN,WC_M_3_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Usg", beginWcM3Usg,WC_M_3_USG_LEN);
     }
   	}
        int localWcM3UkgCounter = -1;
        public boolean isWcM3UkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3UkgCounter != sharedCounter;
           localWcM3UkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3UkgIsNumeric() {
	      return decimalIsNumeric(beginWcM3Ukg,WC_M_3_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3UkgString() {
            return getPackedString(beginWcM3Ukg,WC_M_3_UKG_LEN);
         }
   protected static final int WC_M_3_UKG_LEN = 9;
   protected static final int WC_M_3_UKG_SCALE = 4;
  	/**
	 * 	serializeWcM3Ukg
	 */
	protected void serializeWcM3Ukg(BigDecimal wcM3Ukg) {
		   putDecimal(beginWcM3Ukg,wcM3Ukg,WC_M_3_UKG_LEN,WC_M_3_UKG_SCALE,true);
		 localWcM3UkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3UkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Ukg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Ukg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Ukg,WC_M_3_UKG_LEN,WC_M_3_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Ukg", beginWcM3Ukg,WC_M_3_UKG_LEN);
     }
   	}
        int localWcM3MmbCounter = -1;
        public boolean isWcM3MmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3MmbCounter != sharedCounter;
           localWcM3MmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3MmbIsNumeric() {
	      return decimalIsNumeric(beginWcM3Mmb,WC_M_3_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3MmbString() {
            return getPackedString(beginWcM3Mmb,WC_M_3_MMB_LEN);
         }
   protected static final int WC_M_3_MMB_LEN = 9;
   protected static final int WC_M_3_MMB_SCALE = 4;
  	/**
	 * 	serializeWcM3Mmb
	 */
	protected void serializeWcM3Mmb(BigDecimal wcM3Mmb) {
		   putDecimal(beginWcM3Mmb,wcM3Mmb,WC_M_3_MMB_LEN,WC_M_3_MMB_SCALE,true);
		 localWcM3MmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3MmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Mmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Mmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Mmb,WC_M_3_MMB_LEN,WC_M_3_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Mmb", beginWcM3Mmb,WC_M_3_MMB_LEN);
     }
   	}
        int localWcM3GbtCounter = -1;
        public boolean isWcM3GbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3GbtCounter != sharedCounter;
           localWcM3GbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3GbtIsNumeric() {
	      return decimalIsNumeric(beginWcM3Gbt,WC_M_3_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3GbtString() {
            return getPackedString(beginWcM3Gbt,WC_M_3_GBT_LEN);
         }
   protected static final int WC_M_3_GBT_LEN = 9;
   protected static final int WC_M_3_GBT_SCALE = 4;
  	/**
	 * 	serializeWcM3Gbt
	 */
	protected void serializeWcM3Gbt(BigDecimal wcM3Gbt) {
		   putDecimal(beginWcM3Gbt,wcM3Gbt,WC_M_3_GBT_LEN,WC_M_3_GBT_SCALE,true);
		 localWcM3GbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3GbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Gbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Gbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Gbt,WC_M_3_GBT_LEN,WC_M_3_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Gbt", beginWcM3Gbt,WC_M_3_GBT_LEN);
     }
   	}
        int localWcM3ThmCounter = -1;
        public boolean isWcM3ThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3ThmCounter != sharedCounter;
           localWcM3ThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3ThmIsNumeric() {
	      return decimalIsNumeric(beginWcM3Thm,WC_M_3_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3ThmString() {
            return getPackedString(beginWcM3Thm,WC_M_3_THM_LEN);
         }
   protected static final int WC_M_3_THM_LEN = 9;
   protected static final int WC_M_3_THM_SCALE = 4;
  	/**
	 * 	serializeWcM3Thm
	 */
	protected void serializeWcM3Thm(BigDecimal wcM3Thm) {
		   putDecimal(beginWcM3Thm,wcM3Thm,WC_M_3_THM_LEN,WC_M_3_THM_SCALE,true);
		 localWcM3ThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3ThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Thm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Thm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Thm,WC_M_3_THM_LEN,WC_M_3_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Thm", beginWcM3Thm,WC_M_3_THM_LEN);
     }
   	}
        int localWcM3MwhCounter = -1;
        public boolean isWcM3MwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3MwhCounter != sharedCounter;
           localWcM3MwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3MwhIsNumeric() {
	      return decimalIsNumeric(beginWcM3Mwh,WC_M_3_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3MwhString() {
            return getPackedString(beginWcM3Mwh,WC_M_3_MWH_LEN);
         }
   protected static final int WC_M_3_MWH_LEN = 9;
   protected static final int WC_M_3_MWH_SCALE = 4;
  	/**
	 * 	serializeWcM3Mwh
	 */
	protected void serializeWcM3Mwh(BigDecimal wcM3Mwh) {
		   putDecimal(beginWcM3Mwh,wcM3Mwh,WC_M_3_MWH_LEN,WC_M_3_MWH_SCALE,true);
		 localWcM3MwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3MwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Mwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Mwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Mwh,WC_M_3_MWH_LEN,WC_M_3_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Mwh", beginWcM3Mwh,WC_M_3_MWH_LEN);
     }
   	}
        int localWcM3GjCounter = -1;
        public boolean isWcM3GjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3GjCounter != sharedCounter;
           localWcM3GjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3GjIsNumeric() {
	      return decimalIsNumeric(beginWcM3Gj,WC_M_3_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3GjString() {
            return getPackedString(beginWcM3Gj,WC_M_3_GJ_LEN);
         }
   protected static final int WC_M_3_GJ_LEN = 9;
   protected static final int WC_M_3_GJ_SCALE = 4;
  	/**
	 * 	serializeWcM3Gj
	 */
	protected void serializeWcM3Gj(BigDecimal wcM3Gj) {
		   putDecimal(beginWcM3Gj,wcM3Gj,WC_M_3_GJ_LEN,WC_M_3_GJ_SCALE,true);
		 localWcM3GjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3GjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Gj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Gj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Gj,WC_M_3_GJ_LEN,WC_M_3_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Gj", beginWcM3Gj,WC_M_3_GJ_LEN);
     }
   	}
        int localWcM3DayCounter = -1;
        public boolean isWcM3DayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcM3DayCounter != sharedCounter;
           localWcM3DayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcM3DayIsNumeric() {
	      return decimalIsNumeric(beginWcM3Day,WC_M_3_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcM3DayString() {
            return getPackedString(beginWcM3Day,WC_M_3_DAY_LEN);
         }
   protected static final int WC_M_3_DAY_LEN = 9;
   protected static final int WC_M_3_DAY_SCALE = 4;
  	/**
	 * 	serializeWcM3Day
	 */
	protected void serializeWcM3Day(BigDecimal wcM3Day) {
		   putDecimal(beginWcM3Day,wcM3Day,WC_M_3_DAY_LEN,WC_M_3_DAY_SCALE,true);
		 localWcM3DayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcM3DayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcM3Day is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcM3Day() throws CFException {	
   	try { 
		 return (getDecimal(beginWcM3Day,WC_M_3_DAY_LEN,WC_M_3_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcM3Day", beginWcM3Day,WC_M_3_DAY_LEN);
     }
   	}




}
  
