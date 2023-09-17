<section class="py-5 text-center container">
    <div class="row py-lg-5">
        <div class="col-lg-6 col-md-8 mx-auto">
            <h1 class="fw-light">List of the featured products</h1>
            <p class="lead text-body-secondary">Something short and leading about the collection below—its contents,
                the creator, etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.</p>
        </div>
    </div>
</section>
<div class="album py-5 bg-body-tertiary">
    <div class="container">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            <#list featuredProducts as product>
                <div class="col">
                    <div class="card shadow-sm">
                        <img src="${product.captionImagePath}" class="img-fluid d-placeholder-img card-img-top" alt="...">
                        <div class="card-body">
                            <h3 class="card-title">${product.productName}</h3>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
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
