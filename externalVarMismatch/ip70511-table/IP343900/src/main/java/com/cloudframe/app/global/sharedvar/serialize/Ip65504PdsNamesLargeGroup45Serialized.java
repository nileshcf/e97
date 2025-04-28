package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup45Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup45Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup45Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_45_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1365S;
            protected  int beginIp65504P1365L;
            protected  int beginIp65504P1366S;
            protected  int beginIp65504P1366L;
            protected  int beginIp65504P1367S;
            protected  int beginIp65504P1367L;
            protected  int beginIp65504P1368S;
            protected  int beginIp65504P1368L;
            protected  int beginIp65504P1369S;
            protected  int beginIp65504P1369L;
            protected  int beginIp65504P1370S;
            protected  int beginIp65504P1370L;
            protected  int beginIp65504P1371S;
            protected  int beginIp65504P1371L;
            protected  int beginIp65504P1372S;
            protected  int beginIp65504P1372L;
            protected  int beginIp65504P1373S;
            protected  int beginIp65504P1373L;
            protected  int beginIp65504P1374S;
            protected  int beginIp65504P1374L;
            protected  int beginIp65504P1375S;
            protected  int beginIp65504P1375L;
            protected  int beginIp65504P1376S;
            protected  int beginIp65504P1376L;
            protected  int beginIp65504P1377S;
            protected  int beginIp65504P1377L;
            protected  int beginIp65504P1378S;
            protected  int beginIp65504P1378L;
            protected  int beginIp65504P1379S;
            protected  int beginIp65504P1379L;
            protected  int beginIp65504P1380S;
            protected  int beginIp65504P1380L;
            protected  int beginIp65504P1381S;
            protected  int beginIp65504P1381L;
            protected  int beginIp65504P1382S;
            protected  int beginIp65504P1382L;
            protected  int beginIp65504P1383S;
            protected  int beginIp65504P1383L;
            protected  int beginIp65504P1384S;
            protected  int beginIp65504P1384L;
            protected  int beginIp65504P1385S;
            protected  int beginIp65504P1385L;
            protected  int beginIp65504P1386S;
            protected  int beginIp65504P1386L;
            protected  int beginIp65504P1387S;
            protected  int beginIp65504P1387L;
            protected  int beginIp65504P1388S;
            protected  int beginIp65504P1388L;
            protected  int beginIp65504P1389S;
            protected  int beginIp65504P1389L;
            protected  int beginIp65504P1390S;
            protected  int beginIp65504P1390L;
            protected  int beginIp65504P1391S;
            protected  int beginIp65504P1391L;
            protected  int beginIp65504P1392S;
            protected  int beginIp65504P1392L;
            protected  int beginIp65504P1393S;
            protected  int beginIp65504P1393L;
            protected  int beginIp65504P1394S;
            protected  int beginIp65504P1394L;
            protected  int beginIp65504P1395S;
            protected  int beginIp65504P1395L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup45Serialized
	**/
    public Ip65504PdsNamesLargeGroup45Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup45Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup45Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup45Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10908); // serialize this field at offset 10908 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup45Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10908 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup45Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_45_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1365S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1365L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1366S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1366L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1367S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1367L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1368S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1368L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1369S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1369L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1370S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1370L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1371S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1371L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1372S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1372L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1373S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1373L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1374S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1374L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1375S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1375L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1376S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1376L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1377S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1377L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1378S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1378L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1379S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1379L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1380S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1380L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1381S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1381L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1382S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1382L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1383S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1383L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1384S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1384L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1385S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1385L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1386S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1386L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1387S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1387L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1388S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1388L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1389S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1389L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1390S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1390L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1391S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1391L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1392S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1392L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1393S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1393L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1394S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1394L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1395S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1395L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1365SCounter = -1;
         public boolean isIp65504P1365SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1365SCounter != sharedCounter;
            localIp65504P1365SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1365_S_LEN = 2;
  	/**
	 * serializeIp65504P1365S
	 */
	protected void serializeIp65504P1365S(short ip65504P1365S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1365S,IP_65504_P_1365_S_LEN)
                  ,beginIp65504P1365S
                  ,IP_65504_P_1365_S_LEN
                 );
            localIp65504P1365SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1365SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1365S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1365S() {	 
			return (getShort(beginIp65504P1365S));
   	}
         int localIp65504P1365LCounter = -1;
         public boolean isIp65504P1365LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1365LCounter != sharedCounter;
            localIp65504P1365LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1365_L_LEN = 2;
  	/**
	 * serializeIp65504P1365L
	 */
	protected void serializeIp65504P1365L(short ip65504P1365L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1365L,IP_65504_P_1365_L_LEN)
                  ,beginIp65504P1365L
                  ,IP_65504_P_1365_L_LEN
                 );
            localIp65504P1365LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1365LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1365L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1365L() {	 
			return (getShort(beginIp65504P1365L));
   	}
         int localIp65504P1366SCounter = -1;
         public boolean isIp65504P1366SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1366SCounter != sharedCounter;
            localIp65504P1366SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1366_S_LEN = 2;
  	/**
	 * serializeIp65504P1366S
	 */
	protected void serializeIp65504P1366S(short ip65504P1366S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1366S,IP_65504_P_1366_S_LEN)
                  ,beginIp65504P1366S
                  ,IP_65504_P_1366_S_LEN
                 );
            localIp65504P1366SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1366SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1366S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1366S() {	 
			return (getShort(beginIp65504P1366S));
   	}
         int localIp65504P1366LCounter = -1;
         public boolean isIp65504P1366LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1366LCounter != sharedCounter;
            localIp65504P1366LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1366_L_LEN = 2;
  	/**
	 * serializeIp65504P1366L
	 */
	protected void serializeIp65504P1366L(short ip65504P1366L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1366L,IP_65504_P_1366_L_LEN)
                  ,beginIp65504P1366L
                  ,IP_65504_P_1366_L_LEN
                 );
            localIp65504P1366LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1366LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1366L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1366L() {	 
			return (getShort(beginIp65504P1366L));
   	}
         int localIp65504P1367SCounter = -1;
         public boolean isIp65504P1367SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1367SCounter != sharedCounter;
            localIp65504P1367SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1367_S_LEN = 2;
  	/**
	 * serializeIp65504P1367S
	 */
	protected void serializeIp65504P1367S(short ip65504P1367S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1367S,IP_65504_P_1367_S_LEN)
                  ,beginIp65504P1367S
                  ,IP_65504_P_1367_S_LEN
                 );
            localIp65504P1367SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1367SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1367S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1367S() {	 
			return (getShort(beginIp65504P1367S));
   	}
         int localIp65504P1367LCounter = -1;
         public boolean isIp65504P1367LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1367LCounter != sharedCounter;
            localIp65504P1367LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1367_L_LEN = 2;
  	/**
	 * serializeIp65504P1367L
	 */
	protected void serializeIp65504P1367L(short ip65504P1367L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1367L,IP_65504_P_1367_L_LEN)
                  ,beginIp65504P1367L
                  ,IP_65504_P_1367_L_LEN
                 );
            localIp65504P1367LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1367LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1367L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1367L() {	 
			return (getShort(beginIp65504P1367L));
   	}
         int localIp65504P1368SCounter = -1;
         public boolean isIp65504P1368SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1368SCounter != sharedCounter;
            localIp65504P1368SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1368_S_LEN = 2;
  	/**
	 * serializeIp65504P1368S
	 */
	protected void serializeIp65504P1368S(short ip65504P1368S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1368S,IP_65504_P_1368_S_LEN)
                  ,beginIp65504P1368S
                  ,IP_65504_P_1368_S_LEN
                 );
            localIp65504P1368SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1368SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1368S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1368S() {	 
			return (getShort(beginIp65504P1368S));
   	}
         int localIp65504P1368LCounter = -1;
         public boolean isIp65504P1368LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1368LCounter != sharedCounter;
            localIp65504P1368LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1368_L_LEN = 2;
  	/**
	 * serializeIp65504P1368L
	 */
	protected void serializeIp65504P1368L(short ip65504P1368L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1368L,IP_65504_P_1368_L_LEN)
                  ,beginIp65504P1368L
                  ,IP_65504_P_1368_L_LEN
                 );
            localIp65504P1368LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1368LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1368L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1368L() {	 
			return (getShort(beginIp65504P1368L));
   	}
         int localIp65504P1369SCounter = -1;
         public boolean isIp65504P1369SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1369SCounter != sharedCounter;
            localIp65504P1369SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1369_S_LEN = 2;
  	/**
	 * serializeIp65504P1369S
	 */
	protected void serializeIp65504P1369S(short ip65504P1369S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1369S,IP_65504_P_1369_S_LEN)
                  ,beginIp65504P1369S
                  ,IP_65504_P_1369_S_LEN
                 );
            localIp65504P1369SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1369SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1369S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1369S() {	 
			return (getShort(beginIp65504P1369S));
   	}
         int localIp65504P1369LCounter = -1;
         public boolean isIp65504P1369LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1369LCounter != sharedCounter;
            localIp65504P1369LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1369_L_LEN = 2;
  	/**
	 * serializeIp65504P1369L
	 */
	protected void serializeIp65504P1369L(short ip65504P1369L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1369L,IP_65504_P_1369_L_LEN)
                  ,beginIp65504P1369L
                  ,IP_65504_P_1369_L_LEN
                 );
            localIp65504P1369LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1369LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1369L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1369L() {	 
			return (getShort(beginIp65504P1369L));
   	}
         int localIp65504P1370SCounter = -1;
         public boolean isIp65504P1370SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1370SCounter != sharedCounter;
            localIp65504P1370SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1370_S_LEN = 2;
  	/**
	 * serializeIp65504P1370S
	 */
	protected void serializeIp65504P1370S(short ip65504P1370S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1370S,IP_65504_P_1370_S_LEN)
                  ,beginIp65504P1370S
                  ,IP_65504_P_1370_S_LEN
                 );
            localIp65504P1370SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1370SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1370S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1370S() {	 
			return (getShort(beginIp65504P1370S));
   	}
         int localIp65504P1370LCounter = -1;
         public boolean isIp65504P1370LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1370LCounter != sharedCounter;
            localIp65504P1370LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1370_L_LEN = 2;
  	/**
	 * serializeIp65504P1370L
	 */
	protected void serializeIp65504P1370L(short ip65504P1370L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1370L,IP_65504_P_1370_L_LEN)
                  ,beginIp65504P1370L
                  ,IP_65504_P_1370_L_LEN
                 );
            localIp65504P1370LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1370LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1370L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1370L() {	 
			return (getShort(beginIp65504P1370L));
   	}
         int localIp65504P1371SCounter = -1;
         public boolean isIp65504P1371SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1371SCounter != sharedCounter;
            localIp65504P1371SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1371_S_LEN = 2;
  	/**
	 * serializeIp65504P1371S
	 */
	protected void serializeIp65504P1371S(short ip65504P1371S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1371S,IP_65504_P_1371_S_LEN)
                  ,beginIp65504P1371S
                  ,IP_65504_P_1371_S_LEN
                 );
            localIp65504P1371SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1371SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1371S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1371S() {	 
			return (getShort(beginIp65504P1371S));
   	}
         int localIp65504P1371LCounter = -1;
         public boolean isIp65504P1371LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1371LCounter != sharedCounter;
            localIp65504P1371LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1371_L_LEN = 2;
  	/**
	 * serializeIp65504P1371L
	 */
	protected void serializeIp65504P1371L(short ip65504P1371L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1371L,IP_65504_P_1371_L_LEN)
                  ,beginIp65504P1371L
                  ,IP_65504_P_1371_L_LEN
                 );
            localIp65504P1371LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1371LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1371L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1371L() {	 
			return (getShort(beginIp65504P1371L));
   	}
         int localIp65504P1372SCounter = -1;
         public boolean isIp65504P1372SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1372SCounter != sharedCounter;
            localIp65504P1372SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1372_S_LEN = 2;
  	/**
	 * serializeIp65504P1372S
	 */
	protected void serializeIp65504P1372S(short ip65504P1372S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1372S,IP_65504_P_1372_S_LEN)
                  ,beginIp65504P1372S
                  ,IP_65504_P_1372_S_LEN
                 );
            localIp65504P1372SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1372SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1372S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1372S() {	 
			return (getShort(beginIp65504P1372S));
   	}
         int localIp65504P1372LCounter = -1;
         public boolean isIp65504P1372LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1372LCounter != sharedCounter;
            localIp65504P1372LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1372_L_LEN = 2;
  	/**
	 * serializeIp65504P1372L
	 */
	protected void serializeIp65504P1372L(short ip65504P1372L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1372L,IP_65504_P_1372_L_LEN)
                  ,beginIp65504P1372L
                  ,IP_65504_P_1372_L_LEN
                 );
            localIp65504P1372LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1372LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1372L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1372L() {	 
			return (getShort(beginIp65504P1372L));
   	}
         int localIp65504P1373SCounter = -1;
         public boolean isIp65504P1373SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1373SCounter != sharedCounter;
            localIp65504P1373SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1373_S_LEN = 2;
  	/**
	 * serializeIp65504P1373S
	 */
	protected void serializeIp65504P1373S(short ip65504P1373S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1373S,IP_65504_P_1373_S_LEN)
                  ,beginIp65504P1373S
                  ,IP_65504_P_1373_S_LEN
                 );
            localIp65504P1373SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1373SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1373S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1373S() {	 
			return (getShort(beginIp65504P1373S));
   	}
         int localIp65504P1373LCounter = -1;
         public boolean isIp65504P1373LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1373LCounter != sharedCounter;
            localIp65504P1373LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1373_L_LEN = 2;
  	/**
	 * serializeIp65504P1373L
	 */
	protected void serializeIp65504P1373L(short ip65504P1373L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1373L,IP_65504_P_1373_L_LEN)
                  ,beginIp65504P1373L
                  ,IP_65504_P_1373_L_LEN
                 );
            localIp65504P1373LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1373LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1373L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1373L() {	 
			return (getShort(beginIp65504P1373L));
   	}
         int localIp65504P1374SCounter = -1;
         public boolean isIp65504P1374SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1374SCounter != sharedCounter;
            localIp65504P1374SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1374_S_LEN = 2;
  	/**
	 * serializeIp65504P1374S
	 */
	protected void serializeIp65504P1374S(short ip65504P1374S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1374S,IP_65504_P_1374_S_LEN)
                  ,beginIp65504P1374S
                  ,IP_65504_P_1374_S_LEN
                 );
            localIp65504P1374SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1374SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1374S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1374S() {	 
			return (getShort(beginIp65504P1374S));
   	}
         int localIp65504P1374LCounter = -1;
         public boolean isIp65504P1374LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1374LCounter != sharedCounter;
            localIp65504P1374LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1374_L_LEN = 2;
  	/**
	 * serializeIp65504P1374L
	 */
	protected void serializeIp65504P1374L(short ip65504P1374L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1374L,IP_65504_P_1374_L_LEN)
                  ,beginIp65504P1374L
                  ,IP_65504_P_1374_L_LEN
                 );
            localIp65504P1374LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1374LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1374L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1374L() {	 
			return (getShort(beginIp65504P1374L));
   	}
         int localIp65504P1375SCounter = -1;
         public boolean isIp65504P1375SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1375SCounter != sharedCounter;
            localIp65504P1375SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1375_S_LEN = 2;
  	/**
	 * serializeIp65504P1375S
	 */
	protected void serializeIp65504P1375S(short ip65504P1375S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1375S,IP_65504_P_1375_S_LEN)
                  ,beginIp65504P1375S
                  ,IP_65504_P_1375_S_LEN
                 );
            localIp65504P1375SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1375SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1375S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1375S() {	 
			return (getShort(beginIp65504P1375S));
   	}
         int localIp65504P1375LCounter = -1;
         public boolean isIp65504P1375LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1375LCounter != sharedCounter;
            localIp65504P1375LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1375_L_LEN = 2;
  	/**
	 * serializeIp65504P1375L
	 */
	protected void serializeIp65504P1375L(short ip65504P1375L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1375L,IP_65504_P_1375_L_LEN)
                  ,beginIp65504P1375L
                  ,IP_65504_P_1375_L_LEN
                 );
            localIp65504P1375LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1375LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1375L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1375L() {	 
			return (getShort(beginIp65504P1375L));
   	}
         int localIp65504P1376SCounter = -1;
         public boolean isIp65504P1376SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1376SCounter != sharedCounter;
            localIp65504P1376SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1376_S_LEN = 2;
  	/**
	 * serializeIp65504P1376S
	 */
	protected void serializeIp65504P1376S(short ip65504P1376S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1376S,IP_65504_P_1376_S_LEN)
                  ,beginIp65504P1376S
                  ,IP_65504_P_1376_S_LEN
                 );
            localIp65504P1376SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1376SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1376S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1376S() {	 
			return (getShort(beginIp65504P1376S));
   	}
         int localIp65504P1376LCounter = -1;
         public boolean isIp65504P1376LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1376LCounter != sharedCounter;
            localIp65504P1376LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1376_L_LEN = 2;
  	/**
	 * serializeIp65504P1376L
	 */
	protected void serializeIp65504P1376L(short ip65504P1376L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1376L,IP_65504_P_1376_L_LEN)
                  ,beginIp65504P1376L
                  ,IP_65504_P_1376_L_LEN
                 );
            localIp65504P1376LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1376LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1376L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1376L() {	 
			return (getShort(beginIp65504P1376L));
   	}
         int localIp65504P1377SCounter = -1;
         public boolean isIp65504P1377SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1377SCounter != sharedCounter;
            localIp65504P1377SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1377_S_LEN = 2;
  	/**
	 * serializeIp65504P1377S
	 */
	protected void serializeIp65504P1377S(short ip65504P1377S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1377S,IP_65504_P_1377_S_LEN)
                  ,beginIp65504P1377S
                  ,IP_65504_P_1377_S_LEN
                 );
            localIp65504P1377SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1377SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1377S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1377S() {	 
			return (getShort(beginIp65504P1377S));
   	}
         int localIp65504P1377LCounter = -1;
         public boolean isIp65504P1377LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1377LCounter != sharedCounter;
            localIp65504P1377LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1377_L_LEN = 2;
  	/**
	 * serializeIp65504P1377L
	 */
	protected void serializeIp65504P1377L(short ip65504P1377L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1377L,IP_65504_P_1377_L_LEN)
                  ,beginIp65504P1377L
                  ,IP_65504_P_1377_L_LEN
                 );
            localIp65504P1377LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1377LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1377L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1377L() {	 
			return (getShort(beginIp65504P1377L));
   	}
         int localIp65504P1378SCounter = -1;
         public boolean isIp65504P1378SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1378SCounter != sharedCounter;
            localIp65504P1378SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1378_S_LEN = 2;
  	/**
	 * serializeIp65504P1378S
	 */
	protected void serializeIp65504P1378S(short ip65504P1378S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1378S,IP_65504_P_1378_S_LEN)
                  ,beginIp65504P1378S
                  ,IP_65504_P_1378_S_LEN
                 );
            localIp65504P1378SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1378SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1378S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1378S() {	 
			return (getShort(beginIp65504P1378S));
   	}
         int localIp65504P1378LCounter = -1;
         public boolean isIp65504P1378LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1378LCounter != sharedCounter;
            localIp65504P1378LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1378_L_LEN = 2;
  	/**
	 * serializeIp65504P1378L
	 */
	protected void serializeIp65504P1378L(short ip65504P1378L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1378L,IP_65504_P_1378_L_LEN)
                  ,beginIp65504P1378L
                  ,IP_65504_P_1378_L_LEN
                 );
            localIp65504P1378LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1378LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1378L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1378L() {	 
			return (getShort(beginIp65504P1378L));
   	}
         int localIp65504P1379SCounter = -1;
         public boolean isIp65504P1379SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1379SCounter != sharedCounter;
            localIp65504P1379SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1379_S_LEN = 2;
  	/**
	 * serializeIp65504P1379S
	 */
	protected void serializeIp65504P1379S(short ip65504P1379S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1379S,IP_65504_P_1379_S_LEN)
                  ,beginIp65504P1379S
                  ,IP_65504_P_1379_S_LEN
                 );
            localIp65504P1379SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1379SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1379S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1379S() {	 
			return (getShort(beginIp65504P1379S));
   	}
         int localIp65504P1379LCounter = -1;
         public boolean isIp65504P1379LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1379LCounter != sharedCounter;
            localIp65504P1379LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1379_L_LEN = 2;
  	/**
	 * serializeIp65504P1379L
	 */
	protected void serializeIp65504P1379L(short ip65504P1379L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1379L,IP_65504_P_1379_L_LEN)
                  ,beginIp65504P1379L
                  ,IP_65504_P_1379_L_LEN
                 );
            localIp65504P1379LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1379LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1379L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1379L() {	 
			return (getShort(beginIp65504P1379L));
   	}
         int localIp65504P1380SCounter = -1;
         public boolean isIp65504P1380SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1380SCounter != sharedCounter;
            localIp65504P1380SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1380_S_LEN = 2;
  	/**
	 * serializeIp65504P1380S
	 */
	protected void serializeIp65504P1380S(short ip65504P1380S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1380S,IP_65504_P_1380_S_LEN)
                  ,beginIp65504P1380S
                  ,IP_65504_P_1380_S_LEN
                 );
            localIp65504P1380SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1380SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1380S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1380S() {	 
			return (getShort(beginIp65504P1380S));
   	}
         int localIp65504P1380LCounter = -1;
         public boolean isIp65504P1380LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1380LCounter != sharedCounter;
            localIp65504P1380LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1380_L_LEN = 2;
  	/**
	 * serializeIp65504P1380L
	 */
	protected void serializeIp65504P1380L(short ip65504P1380L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1380L,IP_65504_P_1380_L_LEN)
                  ,beginIp65504P1380L
                  ,IP_65504_P_1380_L_LEN
                 );
            localIp65504P1380LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1380LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1380L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1380L() {	 
			return (getShort(beginIp65504P1380L));
   	}
         int localIp65504P1381SCounter = -1;
         public boolean isIp65504P1381SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1381SCounter != sharedCounter;
            localIp65504P1381SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1381_S_LEN = 2;
  	/**
	 * serializeIp65504P1381S
	 */
	protected void serializeIp65504P1381S(short ip65504P1381S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1381S,IP_65504_P_1381_S_LEN)
                  ,beginIp65504P1381S
                  ,IP_65504_P_1381_S_LEN
                 );
            localIp65504P1381SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1381SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1381S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1381S() {	 
			return (getShort(beginIp65504P1381S));
   	}
         int localIp65504P1381LCounter = -1;
         public boolean isIp65504P1381LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1381LCounter != sharedCounter;
            localIp65504P1381LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1381_L_LEN = 2;
  	/**
	 * serializeIp65504P1381L
	 */
	protected void serializeIp65504P1381L(short ip65504P1381L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1381L,IP_65504_P_1381_L_LEN)
                  ,beginIp65504P1381L
                  ,IP_65504_P_1381_L_LEN
                 );
            localIp65504P1381LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1381LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1381L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1381L() {	 
			return (getShort(beginIp65504P1381L));
   	}
         int localIp65504P1382SCounter = -1;
         public boolean isIp65504P1382SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1382SCounter != sharedCounter;
            localIp65504P1382SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1382_S_LEN = 2;
  	/**
	 * serializeIp65504P1382S
	 */
	protected void serializeIp65504P1382S(short ip65504P1382S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1382S,IP_65504_P_1382_S_LEN)
                  ,beginIp65504P1382S
                  ,IP_65504_P_1382_S_LEN
                 );
            localIp65504P1382SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1382SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1382S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1382S() {	 
			return (getShort(beginIp65504P1382S));
   	}
         int localIp65504P1382LCounter = -1;
         public boolean isIp65504P1382LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1382LCounter != sharedCounter;
            localIp65504P1382LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1382_L_LEN = 2;
  	/**
	 * serializeIp65504P1382L
	 */
	protected void serializeIp65504P1382L(short ip65504P1382L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1382L,IP_65504_P_1382_L_LEN)
                  ,beginIp65504P1382L
                  ,IP_65504_P_1382_L_LEN
                 );
            localIp65504P1382LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1382LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1382L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1382L() {	 
			return (getShort(beginIp65504P1382L));
   	}
         int localIp65504P1383SCounter = -1;
         public boolean isIp65504P1383SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1383SCounter != sharedCounter;
            localIp65504P1383SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1383_S_LEN = 2;
  	/**
	 * serializeIp65504P1383S
	 */
	protected void serializeIp65504P1383S(short ip65504P1383S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1383S,IP_65504_P_1383_S_LEN)
                  ,beginIp65504P1383S
                  ,IP_65504_P_1383_S_LEN
                 );
            localIp65504P1383SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1383SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1383S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1383S() {	 
			return (getShort(beginIp65504P1383S));
   	}
         int localIp65504P1383LCounter = -1;
         public boolean isIp65504P1383LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1383LCounter != sharedCounter;
            localIp65504P1383LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1383_L_LEN = 2;
  	/**
	 * serializeIp65504P1383L
	 */
	protected void serializeIp65504P1383L(short ip65504P1383L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1383L,IP_65504_P_1383_L_LEN)
                  ,beginIp65504P1383L
                  ,IP_65504_P_1383_L_LEN
                 );
            localIp65504P1383LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1383LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1383L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1383L() {	 
			return (getShort(beginIp65504P1383L));
   	}
         int localIp65504P1384SCounter = -1;
         public boolean isIp65504P1384SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1384SCounter != sharedCounter;
            localIp65504P1384SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1384_S_LEN = 2;
  	/**
	 * serializeIp65504P1384S
	 */
	protected void serializeIp65504P1384S(short ip65504P1384S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1384S,IP_65504_P_1384_S_LEN)
                  ,beginIp65504P1384S
                  ,IP_65504_P_1384_S_LEN
                 );
            localIp65504P1384SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1384SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1384S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1384S() {	 
			return (getShort(beginIp65504P1384S));
   	}
         int localIp65504P1384LCounter = -1;
         public boolean isIp65504P1384LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1384LCounter != sharedCounter;
            localIp65504P1384LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1384_L_LEN = 2;
  	/**
	 * serializeIp65504P1384L
	 */
	protected void serializeIp65504P1384L(short ip65504P1384L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1384L,IP_65504_P_1384_L_LEN)
                  ,beginIp65504P1384L
                  ,IP_65504_P_1384_L_LEN
                 );
            localIp65504P1384LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1384LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1384L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1384L() {	 
			return (getShort(beginIp65504P1384L));
   	}
         int localIp65504P1385SCounter = -1;
         public boolean isIp65504P1385SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1385SCounter != sharedCounter;
            localIp65504P1385SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1385_S_LEN = 2;
  	/**
	 * serializeIp65504P1385S
	 */
	protected void serializeIp65504P1385S(short ip65504P1385S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1385S,IP_65504_P_1385_S_LEN)
                  ,beginIp65504P1385S
                  ,IP_65504_P_1385_S_LEN
                 );
            localIp65504P1385SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1385SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1385S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1385S() {	 
			return (getShort(beginIp65504P1385S));
   	}
         int localIp65504P1385LCounter = -1;
         public boolean isIp65504P1385LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1385LCounter != sharedCounter;
            localIp65504P1385LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1385_L_LEN = 2;
  	/**
	 * serializeIp65504P1385L
	 */
	protected void serializeIp65504P1385L(short ip65504P1385L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1385L,IP_65504_P_1385_L_LEN)
                  ,beginIp65504P1385L
                  ,IP_65504_P_1385_L_LEN
                 );
            localIp65504P1385LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1385LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1385L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1385L() {	 
			return (getShort(beginIp65504P1385L));
   	}
         int localIp65504P1386SCounter = -1;
         public boolean isIp65504P1386SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1386SCounter != sharedCounter;
            localIp65504P1386SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1386_S_LEN = 2;
  	/**
	 * serializeIp65504P1386S
	 */
	protected void serializeIp65504P1386S(short ip65504P1386S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1386S,IP_65504_P_1386_S_LEN)
                  ,beginIp65504P1386S
                  ,IP_65504_P_1386_S_LEN
                 );
            localIp65504P1386SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1386SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1386S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1386S() {	 
			return (getShort(beginIp65504P1386S));
   	}
         int localIp65504P1386LCounter = -1;
         public boolean isIp65504P1386LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1386LCounter != sharedCounter;
            localIp65504P1386LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1386_L_LEN = 2;
  	/**
	 * serializeIp65504P1386L
	 */
	protected void serializeIp65504P1386L(short ip65504P1386L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1386L,IP_65504_P_1386_L_LEN)
                  ,beginIp65504P1386L
                  ,IP_65504_P_1386_L_LEN
                 );
            localIp65504P1386LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1386LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1386L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1386L() {	 
			return (getShort(beginIp65504P1386L));
   	}
         int localIp65504P1387SCounter = -1;
         public boolean isIp65504P1387SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1387SCounter != sharedCounter;
            localIp65504P1387SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1387_S_LEN = 2;
  	/**
	 * serializeIp65504P1387S
	 */
	protected void serializeIp65504P1387S(short ip65504P1387S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1387S,IP_65504_P_1387_S_LEN)
                  ,beginIp65504P1387S
                  ,IP_65504_P_1387_S_LEN
                 );
            localIp65504P1387SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1387SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1387S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1387S() {	 
			return (getShort(beginIp65504P1387S));
   	}
         int localIp65504P1387LCounter = -1;
         public boolean isIp65504P1387LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1387LCounter != sharedCounter;
            localIp65504P1387LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1387_L_LEN = 2;
  	/**
	 * serializeIp65504P1387L
	 */
	protected void serializeIp65504P1387L(short ip65504P1387L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1387L,IP_65504_P_1387_L_LEN)
                  ,beginIp65504P1387L
                  ,IP_65504_P_1387_L_LEN
                 );
            localIp65504P1387LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1387LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1387L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1387L() {	 
			return (getShort(beginIp65504P1387L));
   	}
         int localIp65504P1388SCounter = -1;
         public boolean isIp65504P1388SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1388SCounter != sharedCounter;
            localIp65504P1388SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1388_S_LEN = 2;
  	/**
	 * serializeIp65504P1388S
	 */
	protected void serializeIp65504P1388S(short ip65504P1388S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1388S,IP_65504_P_1388_S_LEN)
                  ,beginIp65504P1388S
                  ,IP_65504_P_1388_S_LEN
                 );
            localIp65504P1388SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1388SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1388S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1388S() {	 
			return (getShort(beginIp65504P1388S));
   	}
         int localIp65504P1388LCounter = -1;
         public boolean isIp65504P1388LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1388LCounter != sharedCounter;
            localIp65504P1388LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1388_L_LEN = 2;
  	/**
	 * serializeIp65504P1388L
	 */
	protected void serializeIp65504P1388L(short ip65504P1388L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1388L,IP_65504_P_1388_L_LEN)
                  ,beginIp65504P1388L
                  ,IP_65504_P_1388_L_LEN
                 );
            localIp65504P1388LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1388LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1388L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1388L() {	 
			return (getShort(beginIp65504P1388L));
   	}
         int localIp65504P1389SCounter = -1;
         public boolean isIp65504P1389SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1389SCounter != sharedCounter;
            localIp65504P1389SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1389_S_LEN = 2;
  	/**
	 * serializeIp65504P1389S
	 */
	protected void serializeIp65504P1389S(short ip65504P1389S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1389S,IP_65504_P_1389_S_LEN)
                  ,beginIp65504P1389S
                  ,IP_65504_P_1389_S_LEN
                 );
            localIp65504P1389SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1389SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1389S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1389S() {	 
			return (getShort(beginIp65504P1389S));
   	}
         int localIp65504P1389LCounter = -1;
         public boolean isIp65504P1389LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1389LCounter != sharedCounter;
            localIp65504P1389LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1389_L_LEN = 2;
  	/**
	 * serializeIp65504P1389L
	 */
	protected void serializeIp65504P1389L(short ip65504P1389L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1389L,IP_65504_P_1389_L_LEN)
                  ,beginIp65504P1389L
                  ,IP_65504_P_1389_L_LEN
                 );
            localIp65504P1389LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1389LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1389L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1389L() {	 
			return (getShort(beginIp65504P1389L));
   	}
         int localIp65504P1390SCounter = -1;
         public boolean isIp65504P1390SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1390SCounter != sharedCounter;
            localIp65504P1390SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1390_S_LEN = 2;
  	/**
	 * serializeIp65504P1390S
	 */
	protected void serializeIp65504P1390S(short ip65504P1390S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1390S,IP_65504_P_1390_S_LEN)
                  ,beginIp65504P1390S
                  ,IP_65504_P_1390_S_LEN
                 );
            localIp65504P1390SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1390SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1390S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1390S() {	 
			return (getShort(beginIp65504P1390S));
   	}
         int localIp65504P1390LCounter = -1;
         public boolean isIp65504P1390LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1390LCounter != sharedCounter;
            localIp65504P1390LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1390_L_LEN = 2;
  	/**
	 * serializeIp65504P1390L
	 */
	protected void serializeIp65504P1390L(short ip65504P1390L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1390L,IP_65504_P_1390_L_LEN)
                  ,beginIp65504P1390L
                  ,IP_65504_P_1390_L_LEN
                 );
            localIp65504P1390LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1390LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1390L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1390L() {	 
			return (getShort(beginIp65504P1390L));
   	}
         int localIp65504P1391SCounter = -1;
         public boolean isIp65504P1391SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1391SCounter != sharedCounter;
            localIp65504P1391SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1391_S_LEN = 2;
  	/**
	 * serializeIp65504P1391S
	 */
	protected void serializeIp65504P1391S(short ip65504P1391S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1391S,IP_65504_P_1391_S_LEN)
                  ,beginIp65504P1391S
                  ,IP_65504_P_1391_S_LEN
                 );
            localIp65504P1391SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1391SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1391S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1391S() {	 
			return (getShort(beginIp65504P1391S));
   	}
         int localIp65504P1391LCounter = -1;
         public boolean isIp65504P1391LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1391LCounter != sharedCounter;
            localIp65504P1391LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1391_L_LEN = 2;
  	/**
	 * serializeIp65504P1391L
	 */
	protected void serializeIp65504P1391L(short ip65504P1391L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1391L,IP_65504_P_1391_L_LEN)
                  ,beginIp65504P1391L
                  ,IP_65504_P_1391_L_LEN
                 );
            localIp65504P1391LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1391LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1391L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1391L() {	 
			return (getShort(beginIp65504P1391L));
   	}
         int localIp65504P1392SCounter = -1;
         public boolean isIp65504P1392SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1392SCounter != sharedCounter;
            localIp65504P1392SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1392_S_LEN = 2;
  	/**
	 * serializeIp65504P1392S
	 */
	protected void serializeIp65504P1392S(short ip65504P1392S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1392S,IP_65504_P_1392_S_LEN)
                  ,beginIp65504P1392S
                  ,IP_65504_P_1392_S_LEN
                 );
            localIp65504P1392SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1392SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1392S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1392S() {	 
			return (getShort(beginIp65504P1392S));
   	}
         int localIp65504P1392LCounter = -1;
         public boolean isIp65504P1392LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1392LCounter != sharedCounter;
            localIp65504P1392LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1392_L_LEN = 2;
  	/**
	 * serializeIp65504P1392L
	 */
	protected void serializeIp65504P1392L(short ip65504P1392L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1392L,IP_65504_P_1392_L_LEN)
                  ,beginIp65504P1392L
                  ,IP_65504_P_1392_L_LEN
                 );
            localIp65504P1392LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1392LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1392L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1392L() {	 
			return (getShort(beginIp65504P1392L));
   	}
         int localIp65504P1393SCounter = -1;
         public boolean isIp65504P1393SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1393SCounter != sharedCounter;
            localIp65504P1393SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1393_S_LEN = 2;
  	/**
	 * serializeIp65504P1393S
	 */
	protected void serializeIp65504P1393S(short ip65504P1393S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1393S,IP_65504_P_1393_S_LEN)
                  ,beginIp65504P1393S
                  ,IP_65504_P_1393_S_LEN
                 );
            localIp65504P1393SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1393SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1393S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1393S() {	 
			return (getShort(beginIp65504P1393S));
   	}
         int localIp65504P1393LCounter = -1;
         public boolean isIp65504P1393LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1393LCounter != sharedCounter;
            localIp65504P1393LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1393_L_LEN = 2;
  	/**
	 * serializeIp65504P1393L
	 */
	protected void serializeIp65504P1393L(short ip65504P1393L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1393L,IP_65504_P_1393_L_LEN)
                  ,beginIp65504P1393L
                  ,IP_65504_P_1393_L_LEN
                 );
            localIp65504P1393LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1393LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1393L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1393L() {	 
			return (getShort(beginIp65504P1393L));
   	}
         int localIp65504P1394SCounter = -1;
         public boolean isIp65504P1394SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1394SCounter != sharedCounter;
            localIp65504P1394SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1394_S_LEN = 2;
  	/**
	 * serializeIp65504P1394S
	 */
	protected void serializeIp65504P1394S(short ip65504P1394S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1394S,IP_65504_P_1394_S_LEN)
                  ,beginIp65504P1394S
                  ,IP_65504_P_1394_S_LEN
                 );
            localIp65504P1394SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1394SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1394S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1394S() {	 
			return (getShort(beginIp65504P1394S));
   	}
         int localIp65504P1394LCounter = -1;
         public boolean isIp65504P1394LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1394LCounter != sharedCounter;
            localIp65504P1394LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1394_L_LEN = 2;
  	/**
	 * serializeIp65504P1394L
	 */
	protected void serializeIp65504P1394L(short ip65504P1394L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1394L,IP_65504_P_1394_L_LEN)
                  ,beginIp65504P1394L
                  ,IP_65504_P_1394_L_LEN
                 );
            localIp65504P1394LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1394LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1394L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1394L() {	 
			return (getShort(beginIp65504P1394L));
   	}
         int localIp65504P1395SCounter = -1;
         public boolean isIp65504P1395SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1395SCounter != sharedCounter;
            localIp65504P1395SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1395_S_LEN = 2;
  	/**
	 * serializeIp65504P1395S
	 */
	protected void serializeIp65504P1395S(short ip65504P1395S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1395S,IP_65504_P_1395_S_LEN)
                  ,beginIp65504P1395S
                  ,IP_65504_P_1395_S_LEN
                 );
            localIp65504P1395SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1395SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1395S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1395S() {	 
			return (getShort(beginIp65504P1395S));
   	}
         int localIp65504P1395LCounter = -1;
         public boolean isIp65504P1395LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1395LCounter != sharedCounter;
            localIp65504P1395LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1395_L_LEN = 2;
  	/**
	 * serializeIp65504P1395L
	 */
	protected void serializeIp65504P1395L(short ip65504P1395L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1395L,IP_65504_P_1395_L_LEN)
                  ,beginIp65504P1395L
                  ,IP_65504_P_1395_L_LEN
                 );
            localIp65504P1395LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1395LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1395L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1395L() {	 
			return (getShort(beginIp65504P1395L));
   	}




}
  
