<div class="col-4 mt-2 mb-2">
    <div class="card">
        <div class="card-header text-center">
            ${param.name}
        </div>
        <div class="card-body">
            <img src="img/${param.image}" alt="" class="card-img">
            <ul class="mt-2 mb-0">
                <li>
                    <label>Gia goc: ${param.price}</label>
                </li>
                <li>
                    <label>Gia moi: ${param.newprice}</label>
                </li>
                <li>
                    <c:set var="newprice" value="${param.newprice}"/>
                    <fmt:formatNumber value="newprice"></fmt:formatNumber>
                    <c:choose>
                        <c:when test="${newprice < 10}">Gia thap</c:when>
                        <c:when test="${newprice > 100}">Gia cao</c:when>
                        <c:otherwise>Binh thuong</c:otherwise>
                    </c:choose>
                </li>
            </ul>
        </div>
        <div class="card-footer text-center">
            Ngày: dd-MM-yyyy
        </div>
    </div>
</div>
