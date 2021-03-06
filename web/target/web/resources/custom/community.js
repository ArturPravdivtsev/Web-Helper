
$(document).ready(function () {

    $(document).on('click', '.unsubscribe', function () {
        var td = $(this).parent('div');
        var community = $('#community').val();

        $.ajax({
            url: '/web_war/communities/' + community + '/web_war/unsubscribe',
            type: 'post',
            success: function () {
                // redirect to community page
                window.location = '/web_war/communities/' + community;
            }
        });
    });

    $(document).on('click', '.subscribe', function () {
        var td = $(this).parent('div');
        var community = $('#community').val();

        $.ajax({
            url: '/web_war/communities/' + community + '/subscribe',
            type: 'post',
            success: function () {
                // redirect to community page
                window.location = '/web_war/communities/' + community;
            }
        });
    });

    $(document).on('click', '.send', function () {
        var text = $('.text').val();
        var community = $('#community').val();

        $.ajax({
            url: '/web_war/communities/' + community + '/news/create',
            type: 'post',
            data: {
                text: text
            },
            success: function (news) {
                $('.news').append(news);
            }
        });
    });

});