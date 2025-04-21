package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup61Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup61Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup61Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_61_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1861S;
            protected  int beginIp65504P1861L;
            protected  int beginIp65504P1862S;
            protected  int beginIp65504P1862L;
            protected  int beginIp65504P1863S;
            protected  int beginIp65504P1863L;
            protected  int beginIp65504P1864S;
            protected  int beginIp65504P1864L;
            protected  int beginIp65504P1865S;
            protected  int beginIp65504P1865L;
            protected  int beginIp65504P1866S;
            protected  int beginIp65504P1866L;
            protected  int beginIp65504P1867S;
            protected  int beginIp65504P1867L;
            protected  int beginIp65504P1868S;
            protected  int beginIp65504P1868L;
            protected  int beginIp65504P1869S;
            protected  int beginIp65504P1869L;
            protected  int beginIp65504P1870S;
            protected  int beginIp65504P1870L;
            protected  int beginIp65504P1871S;
            protected  int beginIp65504P1871L;
            protected  int beginIp65504P1872S;
            protected  int beginIp65504P1872L;
            protected  int beginIp65504P1873S;
            protected  int beginIp65504P1873L;
            protected  int beginIp65504P1874S;
            protected  int beginIp65504P1874L;
            protected  int beginIp65504P1875S;
            protected  int beginIp65504P1875L;
            protected  int beginIp65504P1876S;
            protected  int beginIp65504P1876L;
            protected  int beginIp65504P1877S;
            protected  int beginIp65504P1877L;
            protected  int beginIp65504P1878S;
            protected  int beginIp65504P1878L;
            protected  int beginIp65504P1879S;
            protected  int beginIp65504P1879L;
            protected  int beginIp65504P1880S;
            protected  int beginIp65504P1880L;
            protected  int beginIp65504P1881S;
            protected  int beginIp65504P1881L;
            protected  int beginIp65504P1882S;
            protected  int beginIp65504P1882L;
            protected  int beginIp65504P1883S;
            protected  int beginIp65504P1883L;
            protected  int beginIp65504P1884S;
            protected  int beginIp65504P1884L;
            protected  int beginIp65504P1885S;
            protected  int beginIp65504P1885L;
            protected  int beginIp65504P1886S;
            protected  int beginIp65504P1886L;
            protected  int beginIp65504P1887S;
            protected  int beginIp65504P1887L;
            protected  int beginIp65504P1888S;
            protected  int beginIp65504P1888L;
            protected  int beginIp65504P1889S;
            protected  int beginIp65504P1889L;
            protected  int beginIp65504P1890S;
            protected  int beginIp65504P1890L;
            protected  int beginIp65504P1891S;
            protected  int beginIp65504P1891L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup61Serialized
	**/
    public Ip65504PdsNamesLargeGroup61Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup61Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup61Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup61Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14876); // serialize this field at offset 14876 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup61Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14876 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup61Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_61_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1861S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1861L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1862S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1862L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1863S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1863L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1864S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1864L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1865S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1865L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1866S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1866L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1867S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1867L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1868S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1868L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1869S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1869L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1870S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1870L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1871S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1871L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1872S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1872L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1873S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1873L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1874S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1874L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1875S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1875L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1876S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1876L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1877S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1877L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1878S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1878L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1879S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1879L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1880S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1880L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1881S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1881L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1882S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1882L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1883S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1883L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1884S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1884L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1885S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1885L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1886S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1886L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1887S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1887L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1888S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1888L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1889S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1889L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1890S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1890L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1891S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1891L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1861SCounter = -1;
         public boolean isIp65504P1861SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1861SCounter != sharedCounter;
            localIp65504P1861SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1861_S_LEN = 2;
  	/**
	 * serializeIp65504P1861S
	 */
	protected void serializeIp65504P1861S(short ip65504P1861S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1861S,IP_65504_P_1861_S_LEN)
                  ,beginIp65504P1861S
                  ,IP_65504_P_1861_S_LEN
                 );
            localIp65504P1861SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1861SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1861S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1861S() {	 
			return (getShort(beginIp65504P1861S));
   	}
         int localIp65504P1861LCounter = -1;
         public boolean isIp65504P1861LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1861LCounter != sharedCounter;
            localIp65504P1861LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1861_L_LEN = 2;
  	/**
	 * serializeIp65504P1861L
	 */
	protected void serializeIp65504P1861L(short ip65504P1861L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1861L,IP_65504_P_1861_L_LEN)
                  ,beginIp65504P1861L
                  ,IP_65504_P_1861_L_LEN
                 );
            localIp65504P1861LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1861LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1861L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1861L() {	 
			return (getShort(beginIp65504P1861L));
   	}
         int localIp65504P1862SCounter = -1;
         public boolean isIp65504P1862SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1862SCounter != sharedCounter;
            localIp65504P1862SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1862_S_LEN = 2;
  	/**
	 * serializeIp65504P1862S
	 */
	protected void serializeIp65504P1862S(short ip65504P1862S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1862S,IP_65504_P_1862_S_LEN)
                  ,beginIp65504P1862S
                  ,IP_65504_P_1862_S_LEN
                 );
            localIp65504P1862SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1862SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1862S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1862S() {	 
			return (getShort(beginIp65504P1862S));
   	}
         int localIp65504P1862LCounter = -1;
         public boolean isIp65504P1862LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1862LCounter != sharedCounter;
            localIp65504P1862LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1862_L_LEN = 2;
  	/**
	 * serializeIp65504P1862L
	 */
	protected void serializeIp65504P1862L(short ip65504P1862L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1862L,IP_65504_P_1862_L_LEN)
                  ,beginIp65504P1862L
                  ,IP_65504_P_1862_L_LEN
                 );
            localIp65504P1862LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1862LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1862L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1862L() {	 
			return (getShort(beginIp65504P1862L));
   	}
         int localIp65504P1863SCounter = -1;
         public boolean isIp65504P1863SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1863SCounter != sharedCounter;
            localIp65504P1863SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1863_S_LEN = 2;
  	/**
	 * serializeIp65504P1863S
	 */
	protected void serializeIp65504P1863S(short ip65504P1863S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1863S,IP_65504_P_1863_S_LEN)
                  ,beginIp65504P1863S
                  ,IP_65504_P_1863_S_LEN
                 );
            localIp65504P1863SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1863SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1863S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1863S() {	 
			return (getShort(beginIp65504P1863S));
   	}
         int localIp65504P1863LCounter = -1;
         public boolean isIp65504P1863LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1863LCounter != sharedCounter;
            localIp65504P1863LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1863_L_LEN = 2;
  	/**
	 * serializeIp65504P1863L
	 */
	protected void serializeIp65504P1863L(short ip65504P1863L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1863L,IP_65504_P_1863_L_LEN)
                  ,beginIp65504P1863L
                  ,IP_65504_P_1863_L_LEN
                 );
            localIp65504P1863LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1863LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1863L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1863L() {	 
			return (getShort(beginIp65504P1863L));
   	}
         int localIp65504P1864SCounter = -1;
         public boolean isIp65504P1864SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1864SCounter != sharedCounter;
            localIp65504P1864SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1864_S_LEN = 2;
  	/**
	 * serializeIp65504P1864S
	 */
	protected void serializeIp65504P1864S(short ip65504P1864S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1864S,IP_65504_P_1864_S_LEN)
                  ,beginIp65504P1864S
                  ,IP_65504_P_1864_S_LEN
                 );
            localIp65504P1864SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1864SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1864S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1864S() {	 
			return (getShort(beginIp65504P1864S));
   	}
         int localIp65504P1864LCounter = -1;
         public boolean isIp65504P1864LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1864LCounter != sharedCounter;
            localIp65504P1864LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1864_L_LEN = 2;
  	/**
	 * serializeIp65504P1864L
	 */
	protected void serializeIp65504P1864L(short ip65504P1864L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1864L,IP_65504_P_1864_L_LEN)
                  ,beginIp65504P1864L
                  ,IP_65504_P_1864_L_LEN
                 );
            localIp65504P1864LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1864LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1864L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1864L() {	 
			return (getShort(beginIp65504P1864L));
   	}
         int localIp65504P1865SCounter = -1;
         public boolean isIp65504P1865SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1865SCounter != sharedCounter;
            localIp65504P1865SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1865_S_LEN = 2;
  	/**
	 * serializeIp65504P1865S
	 */
	protected void serializeIp65504P1865S(short ip65504P1865S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1865S,IP_65504_P_1865_S_LEN)
                  ,beginIp65504P1865S
                  ,IP_65504_P_1865_S_LEN
                 );
            localIp65504P1865SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1865SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1865S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1865S() {	 
			return (getShort(beginIp65504P1865S));
   	}
         int localIp65504P1865LCounter = -1;
         public boolean isIp65504P1865LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1865LCounter != sharedCounter;
            localIp65504P1865LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1865_L_LEN = 2;
  	/**
	 * serializeIp65504P1865L
	 */
	protected void serializeIp65504P1865L(short ip65504P1865L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1865L,IP_65504_P_1865_L_LEN)
                  ,beginIp65504P1865L
                  ,IP_65504_P_1865_L_LEN
                 );
            localIp65504P1865LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1865LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1865L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1865L() {	 
			return (getShort(beginIp65504P1865L));
   	}
         int localIp65504P1866SCounter = -1;
         public boolean isIp65504P1866SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1866SCounter != sharedCounter;
            localIp65504P1866SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1866_S_LEN = 2;
  	/**
	 * serializeIp65504P1866S
	 */
	protected void serializeIp65504P1866S(short ip65504P1866S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1866S,IP_65504_P_1866_S_LEN)
                  ,beginIp65504P1866S
                  ,IP_65504_P_1866_S_LEN
                 );
            localIp65504P1866SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1866SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1866S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1866S() {	 
			return (getShort(beginIp65504P1866S));
   	}
         int localIp65504P1866LCounter = -1;
         public boolean isIp65504P1866LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1866LCounter != sharedCounter;
            localIp65504P1866LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1866_L_LEN = 2;
  	/**
	 * serializeIp65504P1866L
	 */
	protected void serializeIp65504P1866L(short ip65504P1866L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1866L,IP_65504_P_1866_L_LEN)
                  ,beginIp65504P1866L
                  ,IP_65504_P_1866_L_LEN
                 );
            localIp65504P1866LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1866LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1866L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1866L() {	 
			return (getShort(beginIp65504P1866L));
   	}
         int localIp65504P1867SCounter = -1;
         public boolean isIp65504P1867SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1867SCounter != sharedCounter;
            localIp65504P1867SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1867_S_LEN = 2;
  	/**
	 * serializeIp65504P1867S
	 */
	protected void serializeIp65504P1867S(short ip65504P1867S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1867S,IP_65504_P_1867_S_LEN)
                  ,beginIp65504P1867S
                  ,IP_65504_P_1867_S_LEN
                 );
            localIp65504P1867SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1867SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1867S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1867S() {	 
			return (getShort(beginIp65504P1867S));
   	}
         int localIp65504P1867LCounter = -1;
         public boolean isIp65504P1867LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1867LCounter != sharedCounter;
            localIp65504P1867LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1867_L_LEN = 2;
  	/**
	 * serializeIp65504P1867L
	 */
	protected void serializeIp65504P1867L(short ip65504P1867L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1867L,IP_65504_P_1867_L_LEN)
                  ,beginIp65504P1867L
                  ,IP_65504_P_1867_L_LEN
                 );
            localIp65504P1867LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1867LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1867L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1867L() {	 
			return (getShort(beginIp65504P1867L));
   	}
         int localIp65504P1868SCounter = -1;
         public boolean isIp65504P1868SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1868SCounter != sharedCounter;
            localIp65504P1868SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1868_S_LEN = 2;
  	/**
	 * serializeIp65504P1868S
	 */
	protected void serializeIp65504P1868S(short ip65504P1868S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1868S,IP_65504_P_1868_S_LEN)
                  ,beginIp65504P1868S
                  ,IP_65504_P_1868_S_LEN
                 );
            localIp65504P1868SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1868SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1868S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1868S() {	 
			return (getShort(beginIp65504P1868S));
   	}
         int localIp65504P1868LCounter = -1;
         public boolean isIp65504P1868LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1868LCounter != sharedCounter;
            localIp65504P1868LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1868_L_LEN = 2;
  	/**
	 * serializeIp65504P1868L
	 */
	protected void serializeIp65504P1868L(short ip65504P1868L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1868L,IP_65504_P_1868_L_LEN)
                  ,beginIp65504P1868L
                  ,IP_65504_P_1868_L_LEN
                 );
            localIp65504P1868LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1868LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1868L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1868L() {	 
			return (getShort(beginIp65504P1868L));
   	}
         int localIp65504P1869SCounter = -1;
         public boolean isIp65504P1869SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1869SCounter != sharedCounter;
            localIp65504P1869SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1869_S_LEN = 2;
  	/**
	 * serializeIp65504P1869S
	 */
	protected void serializeIp65504P1869S(short ip65504P1869S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1869S,IP_65504_P_1869_S_LEN)
                  ,beginIp65504P1869S
                  ,IP_65504_P_1869_S_LEN
                 );
            localIp65504P1869SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1869SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1869S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1869S() {	 
			return (getShort(beginIp65504P1869S));
   	}
         int localIp65504P1869LCounter = -1;
         public boolean isIp65504P1869LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1869LCounter != sharedCounter;
            localIp65504P1869LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1869_L_LEN = 2;
  	/**
	 * serializeIp65504P1869L
	 */
	protected void serializeIp65504P1869L(short ip65504P1869L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1869L,IP_65504_P_1869_L_LEN)
                  ,beginIp65504P1869L
                  ,IP_65504_P_1869_L_LEN
                 );
            localIp65504P1869LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1869LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1869L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1869L() {	 
			return (getShort(beginIp65504P1869L));
   	}
         int localIp65504P1870SCounter = -1;
         public boolean isIp65504P1870SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1870SCounter != sharedCounter;
            localIp65504P1870SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1870_S_LEN = 2;
  	/**
	 * serializeIp65504P1870S
	 */
	protected void serializeIp65504P1870S(short ip65504P1870S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1870S,IP_65504_P_1870_S_LEN)
                  ,beginIp65504P1870S
                  ,IP_65504_P_1870_S_LEN
                 );
            localIp65504P1870SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1870SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1870S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1870S() {	 
			return (getShort(beginIp65504P1870S));
   	}
         int localIp65504P1870LCounter = -1;
         public boolean isIp65504P1870LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1870LCounter != sharedCounter;
            localIp65504P1870LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1870_L_LEN = 2;
  	/**
	 * serializeIp65504P1870L
	 */
	protected void serializeIp65504P1870L(short ip65504P1870L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1870L,IP_65504_P_1870_L_LEN)
                  ,beginIp65504P1870L
                  ,IP_65504_P_1870_L_LEN
                 );
            localIp65504P1870LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1870LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1870L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1870L() {	 
			return (getShort(beginIp65504P1870L));
   	}
         int localIp65504P1871SCounter = -1;
         public boolean isIp65504P1871SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1871SCounter != sharedCounter;
            localIp65504P1871SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1871_S_LEN = 2;
  	/**
	 * serializeIp65504P1871S
	 */
	protected void serializeIp65504P1871S(short ip65504P1871S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1871S,IP_65504_P_1871_S_LEN)
                  ,beginIp65504P1871S
                  ,IP_65504_P_1871_S_LEN
                 );
            localIp65504P1871SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1871SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1871S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1871S() {	 
			return (getShort(beginIp65504P1871S));
   	}
         int localIp65504P1871LCounter = -1;
         public boolean isIp65504P1871LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1871LCounter != sharedCounter;
            localIp65504P1871LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1871_L_LEN = 2;
  	/**
	 * serializeIp65504P1871L
	 */
	protected void serializeIp65504P1871L(short ip65504P1871L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1871L,IP_65504_P_1871_L_LEN)
                  ,beginIp65504P1871L
                  ,IP_65504_P_1871_L_LEN
                 );
            localIp65504P1871LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1871LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1871L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1871L() {	 
			return (getShort(beginIp65504P1871L));
   	}
         int localIp65504P1872SCounter = -1;
         public boolean isIp65504P1872SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1872SCounter != sharedCounter;
            localIp65504P1872SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1872_S_LEN = 2;
  	/**
	 * serializeIp65504P1872S
	 */
	protected void serializeIp65504P1872S(short ip65504P1872S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1872S,IP_65504_P_1872_S_LEN)
                  ,beginIp65504P1872S
                  ,IP_65504_P_1872_S_LEN
                 );
            localIp65504P1872SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1872SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1872S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1872S() {	 
			return (getShort(beginIp65504P1872S));
   	}
         int localIp65504P1872LCounter = -1;
         public boolean isIp65504P1872LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1872LCounter != sharedCounter;
            localIp65504P1872LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1872_L_LEN = 2;
  	/**
	 * serializeIp65504P1872L
	 */
	protected void serializeIp65504P1872L(short ip65504P1872L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1872L,IP_65504_P_1872_L_LEN)
                  ,beginIp65504P1872L
                  ,IP_65504_P_1872_L_LEN
                 );
            localIp65504P1872LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1872LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1872L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1872L() {	 
			return (getShort(beginIp65504P1872L));
   	}
         int localIp65504P1873SCounter = -1;
         public boolean isIp65504P1873SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1873SCounter != sharedCounter;
            localIp65504P1873SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1873_S_LEN = 2;
  	/**
	 * serializeIp65504P1873S
	 */
	protected void serializeIp65504P1873S(short ip65504P1873S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1873S,IP_65504_P_1873_S_LEN)
                  ,beginIp65504P1873S
                  ,IP_65504_P_1873_S_LEN
                 );
            localIp65504P1873SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1873SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1873S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1873S() {	 
			return (getShort(beginIp65504P1873S));
   	}
         int localIp65504P1873LCounter = -1;
         public boolean isIp65504P1873LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1873LCounter != sharedCounter;
            localIp65504P1873LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1873_L_LEN = 2;
  	/**
	 * serializeIp65504P1873L
	 */
	protected void serializeIp65504P1873L(short ip65504P1873L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1873L,IP_65504_P_1873_L_LEN)
                  ,beginIp65504P1873L
                  ,IP_65504_P_1873_L_LEN
                 );
            localIp65504P1873LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1873LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1873L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1873L() {	 
			return (getShort(beginIp65504P1873L));
   	}
         int localIp65504P1874SCounter = -1;
         public boolean isIp65504P1874SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1874SCounter != sharedCounter;
            localIp65504P1874SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1874_S_LEN = 2;
  	/**
	 * serializeIp65504P1874S
	 */
	protected void serializeIp65504P1874S(short ip65504P1874S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1874S,IP_65504_P_1874_S_LEN)
                  ,beginIp65504P1874S
                  ,IP_65504_P_1874_S_LEN
                 );
            localIp65504P1874SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1874SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1874S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1874S() {	 
			return (getShort(beginIp65504P1874S));
   	}
         int localIp65504P1874LCounter = -1;
         public boolean isIp65504P1874LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1874LCounter != sharedCounter;
            localIp65504P1874LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1874_L_LEN = 2;
  	/**
	 * serializeIp65504P1874L
	 */
	protected void serializeIp65504P1874L(short ip65504P1874L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1874L,IP_65504_P_1874_L_LEN)
                  ,beginIp65504P1874L
                  ,IP_65504_P_1874_L_LEN
                 );
            localIp65504P1874LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1874LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1874L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1874L() {	 
			return (getShort(beginIp65504P1874L));
   	}
         int localIp65504P1875SCounter = -1;
         public boolean isIp65504P1875SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1875SCounter != sharedCounter;
            localIp65504P1875SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1875_S_LEN = 2;
  	/**
	 * serializeIp65504P1875S
	 */
	protected void serializeIp65504P1875S(short ip65504P1875S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1875S,IP_65504_P_1875_S_LEN)
                  ,beginIp65504P1875S
                  ,IP_65504_P_1875_S_LEN
                 );
            localIp65504P1875SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1875SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1875S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1875S() {	 
			return (getShort(beginIp65504P1875S));
   	}
         int localIp65504P1875LCounter = -1;
         public boolean isIp65504P1875LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1875LCounter != sharedCounter;
            localIp65504P1875LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1875_L_LEN = 2;
  	/**
	 * serializeIp65504P1875L
	 */
	protected void serializeIp65504P1875L(short ip65504P1875L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1875L,IP_65504_P_1875_L_LEN)
                  ,beginIp65504P1875L
                  ,IP_65504_P_1875_L_LEN
                 );
            localIp65504P1875LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1875LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1875L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1875L() {	 
			return (getShort(beginIp65504P1875L));
   	}
         int localIp65504P1876SCounter = -1;
         public boolean isIp65504P1876SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1876SCounter != sharedCounter;
            localIp65504P1876SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1876_S_LEN = 2;
  	/**
	 * serializeIp65504P1876S
	 */
	protected void serializeIp65504P1876S(short ip65504P1876S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1876S,IP_65504_P_1876_S_LEN)
                  ,beginIp65504P1876S
                  ,IP_65504_P_1876_S_LEN
                 );
            localIp65504P1876SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1876SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1876S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1876S() {	 
			return (getShort(beginIp65504P1876S));
   	}
         int localIp65504P1876LCounter = -1;
         public boolean isIp65504P1876LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1876LCounter != sharedCounter;
            localIp65504P1876LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1876_L_LEN = 2;
  	/**
	 * serializeIp65504P1876L
	 */
	protected void serializeIp65504P1876L(short ip65504P1876L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1876L,IP_65504_P_1876_L_LEN)
                  ,beginIp65504P1876L
                  ,IP_65504_P_1876_L_LEN
                 );
            localIp65504P1876LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1876LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1876L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1876L() {	 
			return (getShort(beginIp65504P1876L));
   	}
         int localIp65504P1877SCounter = -1;
         public boolean isIp65504P1877SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1877SCounter != sharedCounter;
            localIp65504P1877SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1877_S_LEN = 2;
  	/**
	 * serializeIp65504P1877S
	 */
	protected void serializeIp65504P1877S(short ip65504P1877S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1877S,IP_65504_P_1877_S_LEN)
                  ,beginIp65504P1877S
                  ,IP_65504_P_1877_S_LEN
                 );
            localIp65504P1877SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1877SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1877S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1877S() {	 
			return (getShort(beginIp65504P1877S));
   	}
         int localIp65504P1877LCounter = -1;
         public boolean isIp65504P1877LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1877LCounter != sharedCounter;
            localIp65504P1877LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1877_L_LEN = 2;
  	/**
	 * serializeIp65504P1877L
	 */
	protected void serializeIp65504P1877L(short ip65504P1877L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1877L,IP_65504_P_1877_L_LEN)
                  ,beginIp65504P1877L
                  ,IP_65504_P_1877_L_LEN
                 );
            localIp65504P1877LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1877LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1877L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1877L() {	 
			return (getShort(beginIp65504P1877L));
   	}
         int localIp65504P1878SCounter = -1;
         public boolean isIp65504P1878SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1878SCounter != sharedCounter;
            localIp65504P1878SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1878_S_LEN = 2;
  	/**
	 * serializeIp65504P1878S
	 */
	protected void serializeIp65504P1878S(short ip65504P1878S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1878S,IP_65504_P_1878_S_LEN)
                  ,beginIp65504P1878S
                  ,IP_65504_P_1878_S_LEN
                 );
            localIp65504P1878SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1878SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1878S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1878S() {	 
			return (getShort(beginIp65504P1878S));
   	}
         int localIp65504P1878LCounter = -1;
         public boolean isIp65504P1878LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1878LCounter != sharedCounter;
            localIp65504P1878LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1878_L_LEN = 2;
  	/**
	 * serializeIp65504P1878L
	 */
	protected void serializeIp65504P1878L(short ip65504P1878L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1878L,IP_65504_P_1878_L_LEN)
                  ,beginIp65504P1878L
                  ,IP_65504_P_1878_L_LEN
                 );
            localIp65504P1878LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1878LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1878L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1878L() {	 
			return (getShort(beginIp65504P1878L));
   	}
         int localIp65504P1879SCounter = -1;
         public boolean isIp65504P1879SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1879SCounter != sharedCounter;
            localIp65504P1879SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1879_S_LEN = 2;
  	/**
	 * serializeIp65504P1879S
	 */
	protected void serializeIp65504P1879S(short ip65504P1879S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1879S,IP_65504_P_1879_S_LEN)
                  ,beginIp65504P1879S
                  ,IP_65504_P_1879_S_LEN
                 );
            localIp65504P1879SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1879SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1879S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1879S() {	 
			return (getShort(beginIp65504P1879S));
   	}
         int localIp65504P1879LCounter = -1;
         public boolean isIp65504P1879LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1879LCounter != sharedCounter;
            localIp65504P1879LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1879_L_LEN = 2;
  	/**
	 * serializeIp65504P1879L
	 */
	protected void serializeIp65504P1879L(short ip65504P1879L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1879L,IP_65504_P_1879_L_LEN)
                  ,beginIp65504P1879L
                  ,IP_65504_P_1879_L_LEN
                 );
            localIp65504P1879LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1879LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1879L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1879L() {	 
			return (getShort(beginIp65504P1879L));
   	}
         int localIp65504P1880SCounter = -1;
         public boolean isIp65504P1880SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1880SCounter != sharedCounter;
            localIp65504P1880SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1880_S_LEN = 2;
  	/**
	 * serializeIp65504P1880S
	 */
	protected void serializeIp65504P1880S(short ip65504P1880S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1880S,IP_65504_P_1880_S_LEN)
                  ,beginIp65504P1880S
                  ,IP_65504_P_1880_S_LEN
                 );
            localIp65504P1880SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1880SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1880S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1880S() {	 
			return (getShort(beginIp65504P1880S));
   	}
         int localIp65504P1880LCounter = -1;
         public boolean isIp65504P1880LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1880LCounter != sharedCounter;
            localIp65504P1880LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1880_L_LEN = 2;
  	/**
	 * serializeIp65504P1880L
	 */
	protected void serializeIp65504P1880L(short ip65504P1880L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1880L,IP_65504_P_1880_L_LEN)
                  ,beginIp65504P1880L
                  ,IP_65504_P_1880_L_LEN
                 );
            localIp65504P1880LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1880LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1880L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1880L() {	 
			return (getShort(beginIp65504P1880L));
   	}
         int localIp65504P1881SCounter = -1;
         public boolean isIp65504P1881SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1881SCounter != sharedCounter;
            localIp65504P1881SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1881_S_LEN = 2;
  	/**
	 * serializeIp65504P1881S
	 */
	protected void serializeIp65504P1881S(short ip65504P1881S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1881S,IP_65504_P_1881_S_LEN)
                  ,beginIp65504P1881S
                  ,IP_65504_P_1881_S_LEN
                 );
            localIp65504P1881SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1881SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1881S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1881S() {	 
			return (getShort(beginIp65504P1881S));
   	}
         int localIp65504P1881LCounter = -1;
         public boolean isIp65504P1881LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1881LCounter != sharedCounter;
            localIp65504P1881LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1881_L_LEN = 2;
  	/**
	 * serializeIp65504P1881L
	 */
	protected void serializeIp65504P1881L(short ip65504P1881L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1881L,IP_65504_P_1881_L_LEN)
                  ,beginIp65504P1881L
                  ,IP_65504_P_1881_L_LEN
                 );
            localIp65504P1881LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1881LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1881L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1881L() {	 
			return (getShort(beginIp65504P1881L));
   	}
         int localIp65504P1882SCounter = -1;
         public boolean isIp65504P1882SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1882SCounter != sharedCounter;
            localIp65504P1882SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1882_S_LEN = 2;
  	/**
	 * serializeIp65504P1882S
	 */
	protected void serializeIp65504P1882S(short ip65504P1882S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1882S,IP_65504_P_1882_S_LEN)
                  ,beginIp65504P1882S
                  ,IP_65504_P_1882_S_LEN
                 );
            localIp65504P1882SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1882SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1882S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1882S() {	 
			return (getShort(beginIp65504P1882S));
   	}
         int localIp65504P1882LCounter = -1;
         public boolean isIp65504P1882LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1882LCounter != sharedCounter;
            localIp65504P1882LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1882_L_LEN = 2;
  	/**
	 * serializeIp65504P1882L
	 */
	protected void serializeIp65504P1882L(short ip65504P1882L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1882L,IP_65504_P_1882_L_LEN)
                  ,beginIp65504P1882L
                  ,IP_65504_P_1882_L_LEN
                 );
            localIp65504P1882LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1882LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1882L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1882L() {	 
			return (getShort(beginIp65504P1882L));
   	}
         int localIp65504P1883SCounter = -1;
         public boolean isIp65504P1883SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1883SCounter != sharedCounter;
            localIp65504P1883SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1883_S_LEN = 2;
  	/**
	 * serializeIp65504P1883S
	 */
	protected void serializeIp65504P1883S(short ip65504P1883S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1883S,IP_65504_P_1883_S_LEN)
                  ,beginIp65504P1883S
                  ,IP_65504_P_1883_S_LEN
                 );
            localIp65504P1883SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1883SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1883S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1883S() {	 
			return (getShort(beginIp65504P1883S));
   	}
         int localIp65504P1883LCounter = -1;
         public boolean isIp65504P1883LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1883LCounter != sharedCounter;
            localIp65504P1883LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1883_L_LEN = 2;
  	/**
	 * serializeIp65504P1883L
	 */
	protected void serializeIp65504P1883L(short ip65504P1883L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1883L,IP_65504_P_1883_L_LEN)
                  ,beginIp65504P1883L
                  ,IP_65504_P_1883_L_LEN
                 );
            localIp65504P1883LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1883LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1883L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1883L() {	 
			return (getShort(beginIp65504P1883L));
   	}
         int localIp65504P1884SCounter = -1;
         public boolean isIp65504P1884SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1884SCounter != sharedCounter;
            localIp65504P1884SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1884_S_LEN = 2;
  	/**
	 * serializeIp65504P1884S
	 */
	protected void serializeIp65504P1884S(short ip65504P1884S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1884S,IP_65504_P_1884_S_LEN)
                  ,beginIp65504P1884S
                  ,IP_65504_P_1884_S_LEN
                 );
            localIp65504P1884SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1884SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1884S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1884S() {	 
			return (getShort(beginIp65504P1884S));
   	}
         int localIp65504P1884LCounter = -1;
         public boolean isIp65504P1884LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1884LCounter != sharedCounter;
            localIp65504P1884LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1884_L_LEN = 2;
  	/**
	 * serializeIp65504P1884L
	 */
	protected void serializeIp65504P1884L(short ip65504P1884L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1884L,IP_65504_P_1884_L_LEN)
                  ,beginIp65504P1884L
                  ,IP_65504_P_1884_L_LEN
                 );
            localIp65504P1884LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1884LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1884L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1884L() {	 
			return (getShort(beginIp65504P1884L));
   	}
         int localIp65504P1885SCounter = -1;
         public boolean isIp65504P1885SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1885SCounter != sharedCounter;
            localIp65504P1885SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1885_S_LEN = 2;
  	/**
	 * serializeIp65504P1885S
	 */
	protected void serializeIp65504P1885S(short ip65504P1885S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1885S,IP_65504_P_1885_S_LEN)
                  ,beginIp65504P1885S
                  ,IP_65504_P_1885_S_LEN
                 );
            localIp65504P1885SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1885SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1885S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1885S() {	 
			return (getShort(beginIp65504P1885S));
   	}
         int localIp65504P1885LCounter = -1;
         public boolean isIp65504P1885LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1885LCounter != sharedCounter;
            localIp65504P1885LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1885_L_LEN = 2;
  	/**
	 * serializeIp65504P1885L
	 */
	protected void serializeIp65504P1885L(short ip65504P1885L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1885L,IP_65504_P_1885_L_LEN)
                  ,beginIp65504P1885L
                  ,IP_65504_P_1885_L_LEN
                 );
            localIp65504P1885LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1885LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1885L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1885L() {	 
			return (getShort(beginIp65504P1885L));
   	}
         int localIp65504P1886SCounter = -1;
         public boolean isIp65504P1886SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1886SCounter != sharedCounter;
            localIp65504P1886SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1886_S_LEN = 2;
  	/**
	 * serializeIp65504P1886S
	 */
	protected void serializeIp65504P1886S(short ip65504P1886S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1886S,IP_65504_P_1886_S_LEN)
                  ,beginIp65504P1886S
                  ,IP_65504_P_1886_S_LEN
                 );
            localIp65504P1886SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1886SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1886S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1886S() {	 
			return (getShort(beginIp65504P1886S));
   	}
         int localIp65504P1886LCounter = -1;
         public boolean isIp65504P1886LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1886LCounter != sharedCounter;
            localIp65504P1886LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1886_L_LEN = 2;
  	/**
	 * serializeIp65504P1886L
	 */
	protected void serializeIp65504P1886L(short ip65504P1886L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1886L,IP_65504_P_1886_L_LEN)
                  ,beginIp65504P1886L
                  ,IP_65504_P_1886_L_LEN
                 );
            localIp65504P1886LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1886LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1886L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1886L() {	 
			return (getShort(beginIp65504P1886L));
   	}
         int localIp65504P1887SCounter = -1;
         public boolean isIp65504P1887SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1887SCounter != sharedCounter;
            localIp65504P1887SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1887_S_LEN = 2;
  	/**
	 * serializeIp65504P1887S
	 */
	protected void serializeIp65504P1887S(short ip65504P1887S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1887S,IP_65504_P_1887_S_LEN)
                  ,beginIp65504P1887S
                  ,IP_65504_P_1887_S_LEN
                 );
            localIp65504P1887SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1887SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1887S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1887S() {	 
			return (getShort(beginIp65504P1887S));
   	}
         int localIp65504P1887LCounter = -1;
         public boolean isIp65504P1887LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1887LCounter != sharedCounter;
            localIp65504P1887LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1887_L_LEN = 2;
  	/**
	 * serializeIp65504P1887L
	 */
	protected void serializeIp65504P1887L(short ip65504P1887L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1887L,IP_65504_P_1887_L_LEN)
                  ,beginIp65504P1887L
                  ,IP_65504_P_1887_L_LEN
                 );
            localIp65504P1887LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1887LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1887L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1887L() {	 
			return (getShort(beginIp65504P1887L));
   	}
         int localIp65504P1888SCounter = -1;
         public boolean isIp65504P1888SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1888SCounter != sharedCounter;
            localIp65504P1888SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1888_S_LEN = 2;
  	/**
	 * serializeIp65504P1888S
	 */
	protected void serializeIp65504P1888S(short ip65504P1888S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1888S,IP_65504_P_1888_S_LEN)
                  ,beginIp65504P1888S
                  ,IP_65504_P_1888_S_LEN
                 );
            localIp65504P1888SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1888SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1888S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1888S() {	 
			return (getShort(beginIp65504P1888S));
   	}
         int localIp65504P1888LCounter = -1;
         public boolean isIp65504P1888LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1888LCounter != sharedCounter;
            localIp65504P1888LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1888_L_LEN = 2;
  	/**
	 * serializeIp65504P1888L
	 */
	protected void serializeIp65504P1888L(short ip65504P1888L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1888L,IP_65504_P_1888_L_LEN)
                  ,beginIp65504P1888L
                  ,IP_65504_P_1888_L_LEN
                 );
            localIp65504P1888LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1888LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1888L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1888L() {	 
			return (getShort(beginIp65504P1888L));
   	}
         int localIp65504P1889SCounter = -1;
         public boolean isIp65504P1889SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1889SCounter != sharedCounter;
            localIp65504P1889SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1889_S_LEN = 2;
  	/**
	 * serializeIp65504P1889S
	 */
	protected void serializeIp65504P1889S(short ip65504P1889S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1889S,IP_65504_P_1889_S_LEN)
                  ,beginIp65504P1889S
                  ,IP_65504_P_1889_S_LEN
                 );
            localIp65504P1889SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1889SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1889S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1889S() {	 
			return (getShort(beginIp65504P1889S));
   	}
         int localIp65504P1889LCounter = -1;
         public boolean isIp65504P1889LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1889LCounter != sharedCounter;
            localIp65504P1889LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1889_L_LEN = 2;
  	/**
	 * serializeIp65504P1889L
	 */
	protected void serializeIp65504P1889L(short ip65504P1889L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1889L,IP_65504_P_1889_L_LEN)
                  ,beginIp65504P1889L
                  ,IP_65504_P_1889_L_LEN
                 );
            localIp65504P1889LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1889LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1889L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1889L() {	 
			return (getShort(beginIp65504P1889L));
   	}
         int localIp65504P1890SCounter = -1;
         public boolean isIp65504P1890SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1890SCounter != sharedCounter;
            localIp65504P1890SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1890_S_LEN = 2;
  	/**
	 * serializeIp65504P1890S
	 */
	protected void serializeIp65504P1890S(short ip65504P1890S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1890S,IP_65504_P_1890_S_LEN)
                  ,beginIp65504P1890S
                  ,IP_65504_P_1890_S_LEN
                 );
            localIp65504P1890SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1890SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1890S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1890S() {	 
			return (getShort(beginIp65504P1890S));
   	}
         int localIp65504P1890LCounter = -1;
         public boolean isIp65504P1890LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1890LCounter != sharedCounter;
            localIp65504P1890LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1890_L_LEN = 2;
  	/**
	 * serializeIp65504P1890L
	 */
	protected void serializeIp65504P1890L(short ip65504P1890L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1890L,IP_65504_P_1890_L_LEN)
                  ,beginIp65504P1890L
                  ,IP_65504_P_1890_L_LEN
                 );
            localIp65504P1890LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1890LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1890L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1890L() {	 
			return (getShort(beginIp65504P1890L));
   	}
         int localIp65504P1891SCounter = -1;
         public boolean isIp65504P1891SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1891SCounter != sharedCounter;
            localIp65504P1891SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1891_S_LEN = 2;
  	/**
	 * serializeIp65504P1891S
	 */
	protected void serializeIp65504P1891S(short ip65504P1891S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1891S,IP_65504_P_1891_S_LEN)
                  ,beginIp65504P1891S
                  ,IP_65504_P_1891_S_LEN
                 );
            localIp65504P1891SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1891SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1891S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1891S() {	 
			return (getShort(beginIp65504P1891S));
   	}
         int localIp65504P1891LCounter = -1;
         public boolean isIp65504P1891LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1891LCounter != sharedCounter;
            localIp65504P1891LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1891_L_LEN = 2;
  	/**
	 * serializeIp65504P1891L
	 */
	protected void serializeIp65504P1891L(short ip65504P1891L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1891L,IP_65504_P_1891_L_LEN)
                  ,beginIp65504P1891L
                  ,IP_65504_P_1891_L_LEN
                 );
            localIp65504P1891LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1891LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1891L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1891L() {	 
			return (getShort(beginIp65504P1891L));
   	}




}
  
