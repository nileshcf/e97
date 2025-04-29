package com.cloudframe.app.o529351u.dto;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dfhcommarea extends DfhcommareaSerialized {
   
				@Getter @Setter private XrefRecord xrefRecord = new XrefRecord();
				@Getter @Setter private XrefCmInfo xrefCmInfo = new XrefCmInfo();
				@Getter @Setter private LinkAreaM51u linkAreaM51u = new LinkAreaM51u();
				@Getter @Setter private PpaPpoaltRecord ppaPpoaltRecord = new PpaPpoaltRecord();
	
	/**
	* Constructor for Dfhcommarea
	**/
    public Dfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getXrefRecord().setParent(this,getStartOffset() + 0);
					getXrefCmInfo().setParent(this,getStartOffset() + 2340);
					getLinkAreaM51u().setParent(this,getStartOffset() + 2592);
					getPpaPpoaltRecord().setParent(this,getStartOffset() + 11961);
	   	/*  end of offset */
    }





}
  
