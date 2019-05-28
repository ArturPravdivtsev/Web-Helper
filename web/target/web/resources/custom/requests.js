
$(document).ready(function () {

    $("table").DataTable();

    $('#all').on('click', function () {
        doAjax('/web_war/requests/all');
    });

    $('#my').on('click', function () {
        doAjax('/web_war/requests/my');
    });

    $('#pending').on('click', function () {
        doAjax('/web_war/requests/pending');
    });

    $(document).on('click', '.help', function () {
        var td = $(this).parent('td');
        var request_id = Number($(this).attr('name'));

        $.ajax({
            url: '/web_war/requests/' + request_id + '/help',
            type: 'post',
            success: function () {
                td.children('button').remove();
                var info = $('<a>').text('info').attr('href', '/web_war/requests/' + request_id)
                    .addClass('btn').addClass('btn-outline').addClass('btn-primary').addClass('btn-xs');
                td.append(info);
            }
        });
    });

    function doAjax(url) {
        $.ajax({
            url: url,
            type: 'get',
            success: function (response) {
                var content = $('.tab-content');
                content.html(response);
                content.find('table').DataTable();
            }
        });
    }

    $('.nav-tabs > li > a').on('click', function () {
        var curLi = $(this).parent();
        curLi.siblings().each(function () {
            $(this).removeClass('active');
        });
        curLi.addClass('active');
    });

});
