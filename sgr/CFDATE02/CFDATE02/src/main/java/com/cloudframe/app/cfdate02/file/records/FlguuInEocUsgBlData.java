package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlguuInEocUsgBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FlguuInEocUsgBlData extends FlguuInEocUsgBlDataSerialized {
   
				@Getter @Setter private FlguuInEocUsgBlDtl flguuInEocUsgBlDtl = new FlguuInEocUsgBlDtl();
				@Getter @Setter private FlguuInEocUsgBlHdr flguuInEocUsgBlHdr = new FlguuInEocUsgBlHdr();
				@Getter @Setter private FlguuInEocUsgBlTlr flguuInEocUsgBlTlr = new FlguuInEocUsgBlTlr();
	
	/**
	* Constructor for FlguuInEocUsgBlData
	**/
    public FlguuInEocUsgBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFlguuInEocUsgBlDtl().setParent(this,getStartOffset() + 0);
					getFlguuInEocUsgBlHdr().setParent(this,getStartOffset() + 0);
					getFlguuInEocUsgBlTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
