﻿DROP VIEW rv_costdetail;

CREATE OR REPLACE VIEW rv_costdetail AS 
 SELECT c.ad_client_id, c.ad_org_id, c.isactive, c.created, c.createdby, c.updated, c.updatedby, p.m_product_id, p.value, p.name, p.upc, p.isbom, p.producttype, p.m_product_category_id, c.m_inoutline_id, c.c_invoiceline_id, asi.m_attributesetinstance_id, asi.m_attributeset_id, asi.lot, asi.serno, acct.c_acctschema_id, acct.c_currency_id, c.amt, c.qty, c.description, c.processed, c.c_orderline_id, c.c_projectissue_id, c.cumulatedamt, c.cumulatedqty, c.currentcostprice, c.currentqty, c.deltaamt, c.deltaqty, c.issotrx, c.m_costdetail_id, c.m_costelement_id, c.m_inventoryline_id, c.m_movementline_id, c.m_productionline_id, c.pp_cost_collector_id, p.ad_org_id AS m_product_ad_org_id, p.classification, p.copyfrom AS m_product_copyfrom, p.created AS m_product_created, p.createdby AS m_product_createdby, p.c_revenuerecognition_id, p.c_subscriptiontype_id, p.c_taxcategory_id, p.c_uom_id, p.description AS m_product_description, p.descriptionurl, p.discontinued, p.discontinuedat, p.documentnote, p.group1, p.group2, p.guaranteedays, p.guaranteedaysmin, p.help, p.imageurl, p.isactive AS m_product_isactive, p.isdropship, p.isexcludeautodelivery, p.isinvoiceprintdetails, p.ispicklistprintdetails, p.ispurchased, p.isselfservice, p.issold, p.isstocked, p.issummary AS m_product_issummary, p.isverified, p.iswebstorefeatured, p.lowlevel, p.m_attributeset_id AS m_product_m_attributeset_id, p.m_attributesetinstance_id AS m_product_m_asi_id, p.m_freightcategory_id, p.m_locator_id, p.processing AS m_product_processing, p.r_mailtext_id, p.salesrep_id AS m_product_salesrep_id, p.s_expensetype_id, p.shelfdepth, p.shelfheight, p.shelfwidth, p.sku, p.s_resource_id, p.unitsperpack, p.unitsperpallet, p.updated AS m_product_updated, p.updatedby AS m_product_updatedby, p.versionno, p.volume, p.weight, acct.ad_org_id AS c_acctschema_ad_org_id, acct.description AS c_acctschema_description, acct.name AS c_acctschema_name, asi.ad_org_id AS m_asi_ad_org_id, asi.created AS m_asi_created, asi.createdby AS m_asi_createdby, asi.description AS m_asi_description, asi.guaranteedate, asi.isactive AS m_asi_isactive, asi.m_lot_id, asi.updated AS m_asi_updated, asi.updatedby AS m_asi_updatedby
   FROM m_costdetail c
   JOIN m_product p ON c.m_product_id = p.m_product_id
   JOIN c_acctschema acct ON c.c_acctschema_id = acct.c_acctschema_id
   JOIN m_attributesetinstance asi ON c.m_attributesetinstance_id = asi.m_attributesetinstance_id;

