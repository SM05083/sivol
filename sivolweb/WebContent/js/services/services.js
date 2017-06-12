angular.module('myAppServices', ['ngResource']).factory('BreakinBadChar', function($resource){

  return $resource('js/json/login.json', {}, {

    query: {method:'GET', params:{resourceName:'breaking_bad_char'}, isArray: true}

  });

});