<section class="py-5 container">
  <#include "carousel.ftl">
</section>
<div class="album py-5 bg-body-tertiary">
    <div class="container">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            <#list featuredProducts as product>
                <div class="col">
                    <div class="card shadow-sm">
                        <img src="/${product.captionImagePath}" class="img-fluid d-placeholder-img card-img-top" alt="...">
                        <div class="card-body">
                            <h3 class="card-title">${product.productName}</h3>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <a class="btn btn-sm btn-outline-secondary" title="${product.productName}" href="${product.urlPath}.html">View</a>
                                    <button type="button" class="btn btn-sm btn-outline-secondary">Add to card</button>
                                </div>
                                <h4 class="pricing-card-title bold" >${product.productPrice} + mdl</h4>
                            </div>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</div>
